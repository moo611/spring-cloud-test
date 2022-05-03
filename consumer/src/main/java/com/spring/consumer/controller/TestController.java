package com.spring.consumer.controller;

import com.spring.consumer.service.TestService;
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

    @GetMapping("/test")
    public String test() {
        return testService.getString();
    }

    @GetMapping("/log")
    public void log(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("SpringCloud-Producer");
        System.out.println(serviceInstance.getHost()+":"+serviceInstance.getPort());

    }

}
