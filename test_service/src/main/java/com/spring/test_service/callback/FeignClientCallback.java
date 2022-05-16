package com.spring.test_service.callback;

import com.spring.test_service.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class FeignClientCallback implements TestService {

    @Override
    public String test() {
        return "容错机制启动";
    }
}
