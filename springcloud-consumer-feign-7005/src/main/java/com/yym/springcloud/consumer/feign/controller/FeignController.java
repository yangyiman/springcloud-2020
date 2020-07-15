package com.yym.springcloud.consumer.feign.controller;

import com.yym.springcloud.consumer.feign.service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class FeignController {

    @Autowired
    private IFeignService iFeignService;

    @GetMapping("/feign")
    public String feign() throws InterruptedException {
        String string = iFeignService.port();
        //TimeUnit.SECONDS.sleep(3);
        System.out.println("string = " + string);
        return string;
    }

    @GetMapping("/feign/timeout")
    public String feign2() throws InterruptedException {
        String string = iFeignService.port2();
        System.out.println("string-timeout = " + string);
        return string;
    }

    @GetMapping("/feign/hello")
    public String hello(){
        return iFeignService.hello();
    }
}
