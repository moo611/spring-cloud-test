package com.spring.streamreceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding(value = {IReceiverService.class})
public class StreamReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamReceiverApplication.class, args);
    }

}
