package com.yym.springcloud.consumer.resttemplate.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    @Bean
    // 自己实现一个轮询算法
    //@LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
