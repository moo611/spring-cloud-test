package com.spring.streamsender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface ISenderService {
    @Output("log-exchange")
    SubscribableChannel send();
}
