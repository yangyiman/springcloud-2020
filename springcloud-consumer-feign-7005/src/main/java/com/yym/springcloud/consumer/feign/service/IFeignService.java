package com.yym.springcloud.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER",fallback = FeignRollbackSericeImpl.class)
@Component
public interface IFeignService {

    @GetMapping("/port")
    String port();

    @GetMapping("/port/timeout")
    String port2() throws InterruptedException;

    @GetMapping("/hello")
    String hello();

}