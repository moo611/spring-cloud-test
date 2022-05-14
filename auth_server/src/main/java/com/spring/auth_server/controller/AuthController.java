package com.spring.auth_server.controller;

import com.spring.auth_server.model.User;
import com.spring.auth_server.params.RespResult;
import com.spring.auth_server.params.login.LoginRequest;
import com.spring.auth_server.service.UserService;
import com.spring.auth_server.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public RespResult doLogin(@RequestBody LoginRequest loginRequest) {

        User user = userService.getUser(loginRequest.getUsername());
        if (user == null) {
            System.out.println("user not found");
            return null;
        }
        if (!user.getPassword().equals(loginRequest.getPassword())) {
            System.out.println("password not right");
            return null;
        }

        String token = JwtUtils.createToken(user.getUsername());

        return new RespResult(200, "", token);
    }

}
