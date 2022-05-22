package com.spring.auth_server.params;

import lombok.Data;

import java.io.Serializable;

@Data
public class RespResult<T> implements Serializable {
    private int status;
    private T data;
    private String message;

    public RespResult(int status, String message, T data) {
        this.data = data;
        this.message = message;
        this.status = status;
    }
}
