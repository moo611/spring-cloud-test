package com.spring.rabbitmq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.*;


@Configuration
public class DirectConfig {

    @Bean
    public Queue directQueue() {
        return new Queue("direct", false);
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("direct", false, false);
    }

    @Bean
    Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("direct");
    }

}
