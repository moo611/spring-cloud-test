package com.spring.auth_server.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.auth_server.params.RespResult;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * session过期
 */
@Component
public class MyExpiredSessionStrategy implements SessionInformationExpiredStrategy {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
        String msg = "登录超时或已在另一台机器登录，您被迫下线！";
        RespResult respResult = new RespResult(0, msg, null);
        HttpServletResponse response = event.getResponse();
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write(objectMapper.writeValueAsString(respResult));
        writer.flush();
        writer.close();
    }
}
