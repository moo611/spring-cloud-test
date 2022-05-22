package com.spring.auth_server.controller;

import com.spring.auth_server.model.User;
import com.spring.auth_server.params.RespResult;
import com.spring.auth_server.params.login.LoginRequest;
import com.spring.auth_server.service.UserService;
import com.spring.auth_server.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
//
//@RestController
//@RequestMapping("/oauth")
//public class AuthController {
//    @Autowired
//    UserService userService;
//    @Autowired
//    private TokenEndpoint tokenEndpoint;
//    @PostMapping("/token")
//    public RespResult doLogin(Principal principal, @RequestBody LoginRequest loginRequest) throws HttpRequestMethodNotSupportedException {
//        Map<String,String> map = new HashMap<>();
//        map.put("username",loginRequest.getUsername());
//        map.put("password",loginRequest.getPassword());
//        OAuth2AccessToken oAuth2AccessToken = tokenEndpoint.postAccessToken(principal, map).getBody();
////        User user = userService.getUser(loginRequest.getUsername());
////        if (user == null) {
////            System.out.println("user not found");
////            return null;
////        }
////        if (!user.getPassword().equals(loginRequest.getPassword())) {
////            System.out.println("password not right");
////            return null;
////        }
////
////        String token = JwtUtils.createToken(user.getUsername());
//
//        return new RespResult(200, "", oAuth2AccessToken.getValue());
//    }
//
//}
