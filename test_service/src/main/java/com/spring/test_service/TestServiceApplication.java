package com.spring.test_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableFeignClients

public class TestServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(TestServiceApplication.class, args);
    }

}
