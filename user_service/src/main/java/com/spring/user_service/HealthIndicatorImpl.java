package com.spring.user_service;

import com.spring.user_service.controller.CheckMySQL;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HealthIndicatorImpl implements HealthIndicator {


    @Override
    public Health health() {
        if(CheckMySQL.isConnecting){
            return new Health.Builder(Status.UP).build();
        }
        return new Health.Builder(Status.DOWN).build();

    }
}
