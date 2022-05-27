package com.spring.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitmqController {
    @Autowired
    Sender sender;

    @RequestMapping("/send")
    public String send(){
        System.out.println("send string:hello world");
        sender.send("hello world");
        return "sending...";
    }
}
