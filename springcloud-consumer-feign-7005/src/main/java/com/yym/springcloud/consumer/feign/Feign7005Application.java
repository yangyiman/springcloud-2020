package com.yym.springcloud.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Feign7005Application {
    public static void main(String[] args) {
        SpringApplication.run(Feign7005Application.class, args);
    }
}
