package com.spring.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-producer")
public interface TestService2 {
    @GetMapping("/test")
    public String test();

}
