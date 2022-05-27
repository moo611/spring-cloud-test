package com.spring.redismq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RedisMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisMqApplication.class, args);
    }

}
