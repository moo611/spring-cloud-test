package com.spring.streamsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding(value = {ISenderService.class})
public class StreamSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamSenderApplication.class, args);
    }

}
