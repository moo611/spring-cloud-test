package com.spring.auth_server.params.login;

import lombok.Data;

import java.io.Serializable;
@Data
public class LoginRequest implements Serializable {
    String username;
    String password;
}
