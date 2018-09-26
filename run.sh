#!/usr/bin/env bash

# Script to deploy the app
deploy(){
# From the remote host-machine, run the following cmd
    docker pull s34n/game-img
    docker run --name='game' -d -it -p 8006:8006 s34n/game-img && docker logs game -f
}

# Tag-And-Push Script to tag & push the app
tagAndPush(){
    docker tag game-img:latest s34n/game-img:latest
    docker push s34n/game-img:latest
}

# Rebuild-Script to clean & build the app using the Dockerfile script
rebuild(){
    gradle clean
    gradle build
    docker build -f Dockerfile -t game-img . --no-cache
    tagAndPush
}

# Let's get rid of the pre-existing docker images on the machine.
if [[ ! -z "$(docker container ps | grep game)" ]]; then
    echo "Game-Service Docker Container Found"
    docker stop game && docker rm game && docker rmi game-img
    rebuild
else
    echo "Game-Service Docker Container NOT Found"
    rebuild
fi

