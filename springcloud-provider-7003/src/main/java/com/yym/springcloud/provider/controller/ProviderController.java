package com.yym.springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/port")
    public String port(){
        return "当前端口为: "+port;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello - "+port;
    }
}
