package com.spring.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模拟mysql连接
 */
@RestController
public class CheckMySQL {

    public static boolean isConnecting = true;

    @GetMapping("/checkConnection")
    public void checkConnection(boolean b){
        //连接MySQL的业务在此处省略
        isConnecting=b;
        System.out.println(isConnecting);
    }


}
