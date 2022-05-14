package com.spring.auth_server.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "haha";
    }


    @PreAuthorize("@myAccessDecisionService.hasPermission('super')")
    @GetMapping("/test2")
    public String test2(){
        return "heiehie";
    }

}
