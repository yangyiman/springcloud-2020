package com.yym.springcloud.consumer.resttemplate.lb;

import lombok.Data;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLoaderBalance {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        if (CollectionUtils.isEmpty(serviceInstances)) {
            throw new RuntimeException("no available instance,please try again");
        }
        // 请求次数%实例总数
        int index = this.getAndSet() % serviceInstances.size();
        return serviceInstances.get(index);
    }

    private final int getAndSet() {
        while (true) {
            int current = atomicInteger.get();
            int next = current >= Integer.MAX_VALUE ? 0 : current + 1;
            // 如果为current,则去修改
            if (this.atomicInteger.compareAndSet(current, next)) {
                System.out.println("===当前请求次数为: " + next);
                return next;
            }
        }

    }
}
