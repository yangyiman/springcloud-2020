package com.yym.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider7003Application {
    // main
    public static void main(String[] args) {
        SpringApplication.run(Provider7003Application.class, args);
    }
}