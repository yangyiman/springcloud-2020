package com.yym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Config7007Application {
    public static void main(String[] args) {
        SpringApplication.run(Config7007Application.class, args);
    }
}