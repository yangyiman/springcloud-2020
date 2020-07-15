package com.yym.springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class ProviderController {
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/port")
    public String port(){
        System.out.println(" provider - "+port);
        return "当前端口为: "+port;
    }

    @GetMapping("/port/timeout")
    public String port2() throws InterruptedException {
        //TimeUnit.SECONDS.sleep(3);
        System.out.println(" provider - timeout - "+port);
        return "当前端口为: "+port;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello - "+port;
    }

}
