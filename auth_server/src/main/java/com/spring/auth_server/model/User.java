package com.spring.auth_server.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class User implements Serializable {

    private int id;
    private String username;
    private String password;
    private Set<Role> roles;
}
