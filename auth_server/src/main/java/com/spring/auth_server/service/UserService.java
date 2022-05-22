package com.spring.auth_server.service;

import com.spring.auth_server.dao.UserMapper;
import com.spring.auth_server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(String username){
        return userMapper.getUserByName(username);
    }

}
