package com.yym.springcloud.consumer.feign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignRollbackSericeImpl implements IFeignService{
    @Override
    public String port() {
        return "server is not avaiable,pleast try again";
    }

    @Override
    public String hello() {
        return null;
    }

    @Override
    public String port2() {
        return "No Hello";
    }
}
