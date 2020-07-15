package com.yym.springcloud.consumer.resttemplate;

import com.yym.springcloud.consumer.rule.ConsumeRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(value = "PROVIDER",configuration = ConsumeRule.class)
public class ConsumerRestTemplate7004Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerRestTemplate7004Application.class, args);
    }
}
