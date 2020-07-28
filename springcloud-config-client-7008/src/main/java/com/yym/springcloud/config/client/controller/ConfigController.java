package com.yym.springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${server.port}")
    private Integer port;
    @Value("${config.version}")
    private Integer version;

    @GetMapping("/get")
    public String get() {
        return version + "--" + port;
    }
}
