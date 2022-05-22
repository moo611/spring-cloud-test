package com.spring.auth_server.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {

    private int id;
    private String name;

}
