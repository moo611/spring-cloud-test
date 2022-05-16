package com.spring.user_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @Value("${spring.cloud.client.ip-address}")
    String ipaddr;
    @Value("${server.port}")
    int port;
    @GetMapping("/test")
    public String test(){
        return "Hello, 我在" + ipaddr + ":" + port;
    }
}
