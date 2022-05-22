package com.spring.auth_server.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.auth_server.params.RespResult;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 未授权
 */
@Component
public class MyAccessDeniedHandler implements AccessDeniedHandler {
    private static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        response.setStatus(403);
        PrintWriter writer = response.getWriter();
        writer.write(objectMapper.writeValueAsString(new RespResult<>(403, "抱歉，您没有权限访问", null)));
        writer.flush();
        writer.close();
    }
}
