package com.yym.springcloud.Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * gateway基于webFlux框架实现的,而webFlux底层使用的是高性能的Reactor的netty
 * 非阻塞响应式的高性能框架
 *
 * zuul和gateway
 *
 * 1. zuul到zuul2一直跳票,迟迟不发布,并且已经进入维护模式
 * 2. gateway是基于异步非阻塞模型上开发的,性能强
 * 3. gateway特性:
 *      3.1 动态路由: 能够匹配任何请求属性
 *      3.2 可以对路由进行断言(Predicate)和过滤(Filter)
 *      3.3 集成Hystrix断路器功能
 *      3.4 集成Spring Cloud的服务发现
 *      3.5 请求限流
 *      3.6 支持路径重写
 */
@SpringBootApplication
public class Gateway7006Application {
    public static void main(String[] args) {
        SpringApplication.run(Gateway7006Application.class, args);
    }
}
