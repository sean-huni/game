FROM openjdk:10-jre-slim
RUN mkdir -p /app/game-service/
COPY build/libs/game.jar /app/game-service/game.jar
RUN apt-get update -y
RUN apt-get install -y vim
RUN apt-get install curl -y
RUN apt-get install -y procps
RUN apt-get install htop -y
RUN apt-get install apt-utils -y
RUN apt-get install iputils-ping -y
RUN apt-get install curl -y
RUN apt-get install net-tools -y
ENV TZ=Africa/Johannesburg
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN ln -fs /usr/share/zoneinfo/$TZ /etc/localtime && \
    dpkg-reconfigure -f noninteractive tzdata
RUN apt-get update -y
RUN java -version
VOLUME /tmp
RUN bash -c 'touch /app/game-service/game.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/game-service/game.jar"]
EXPOSE 8006
