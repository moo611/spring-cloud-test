package com.spring.streamsender;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ISenderService senderService;

    @RequestMapping("/send")
    public String send(){
        String msg  ="hello";
        Message message =  MessageBuilder.withPayload(msg.getBytes()).build();
        senderService.send().send(message);
        return "OK";
    }
}
