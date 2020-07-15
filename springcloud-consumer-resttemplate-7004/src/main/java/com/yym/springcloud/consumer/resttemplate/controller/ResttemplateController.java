package com.yym.springcloud.consumer.resttemplate.controller;

import com.netflix.appinfo.InstanceInfo;
import com.yym.springcloud.consumer.resttemplate.lb.MyLoaderBalance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.geom.RectangularShape;
import java.util.List;
import java.util.Set;

@RestController
@Slf4j
public class ResttemplateController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private MyLoaderBalance myLoaderBalance;
    @Autowired
    private DiscoveryClient discoveryClient;

    String applicationServerName = "PROVIDER";

    @GetMapping("/rest")
    public String getRest(){
        return restTemplate.getForObject("http://"+applicationServerName + "/port", String.class);
    }

    @GetMapping("/discovery")
    public Object get(){
        List<String> services = discoveryClient.getServices();
        services.forEach(System.out::println);

        List<ServiceInstance> instances = discoveryClient.getInstances(applicationServerName);
        instances.forEach(i->{
            System.out.println("i.getInstanceId() = " + i.getInstanceId());
            System.out.println("i.getPort() = " + i.getPort());
            System.out.println("i.getHost() = " + i.getHost());
            System.out.println("i.getMetadata() = " + i.getMetadata());
            System.out.println("i.getScheme() = " + i.getScheme());
            System.out.println("i.getServiceId() = " + i.getServiceId());
            System.out.println("i.getUri() = " + i.getUri());
        });
        return instances;
    }

    @GetMapping("/lb/hello")
    public String testlb(){
        ServiceInstance instance = myLoaderBalance.instance((List<ServiceInstance>) this.get());
        return restTemplate.getForObject(instance.getUri() + "/hello", String.class);
    }
}
