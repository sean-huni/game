package io.sciro.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * PROJECT   : game
 * PACKAGE   : io.sciro.game
 * USER      : sean
 * DATE      : 17-Mon-Sep-2018
 * TIME      : 16:08
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@SpringBootApplication
@EnableEurekaClient
public class GameApp {
    public static void main(String[] args) {
        SpringApplication.run(GameApp.class, args);
    }
}
