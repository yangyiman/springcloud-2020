package com.yym.springcloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 实现手动刷星
 *
 * 1 @RefreshScope
 * 2 开通健康检查 manager.endpoints.web.exposure.incloude: "*"
 * 3 发送post http://localhost:port/actuator/refresh
 */
@SpringBootApplication
public class Client7008Application {
    public static void main(String[] args) {
        SpringApplication.run(Client7008Application.class, args);
    }
}
