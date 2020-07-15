package com.yym.springcloud.consumer.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 定制ribbon的负载均衡算法
 * 默认ribbon负载均衡有:
 *  1. RoundRobbinRule  轮询,默认
 *  2. RandomRule 随机
 *  3. RetryRule 先按轮询,如果服务失败则
 *  4. WeightedResponseTimeRule  优先匹配响应速度快的实例
 *  5. BestAvailableRule 先过滤多次访问失败而处于断路器跳闸状态的实例,然后再挑选并发量最小的实例
 *  6. AvailableFilterRule 先过滤故障实例,挑选并发量小的实例
 *  7. ZoneAvoidanceRule 复合判断server所在区域的性能和server的可用性选择实例
 *
 *  自定义负载均衡算法:
 *      1. 不能被Spring扫描到,否则会被所有Ribbon客户端共享,达不到定制目的
 *      2. 在主启动类上加@RibbonClient(实例名,自定义规则类)
 */
@Configuration
public class ConsumeRule {
    // 随机
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
