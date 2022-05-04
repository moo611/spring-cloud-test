package com.spring.consumer.controller;

import com.netflix.discovery.converters.Auto;
import com.spring.consumer.service.TestService;
import com.spring.consumer.service.TestService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    TestService testService;
    @Autowired
    TestService2 testService2;

    @GetMapping("/test")
    public String test() {
        return testService.getString();
    }

    @GetMapping("/log")
    public void log(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-producer");
        System.out.println(serviceInstance.getHost()+":"+serviceInstance.getPort());

    }

    @GetMapping("/test2")
    public String test2(){
        return testService2.test();
    }

}
