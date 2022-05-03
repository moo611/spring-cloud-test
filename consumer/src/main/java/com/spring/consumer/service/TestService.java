package com.spring.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    public static String SERVIER_NAME = "SpringCloud-Producer";

    @Autowired
    private RestTemplate restTemplate;

    public String getString(){
        String res = restTemplate.getForObject("http://" + SERVIER_NAME + "/test", String.class);
        return res;
    }

}
