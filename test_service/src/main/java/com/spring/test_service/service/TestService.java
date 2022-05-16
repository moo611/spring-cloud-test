package com.spring.test_service.service;

import com.spring.test_service.callback.FeignClientCallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service",fallback = FeignClientCallback.class)
public interface TestService {
    @GetMapping("/test")
    public String test();

}
