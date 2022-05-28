package com.spring.streamreceiver;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IReceiverService {
    @Input("log-exchange")
    SubscribableChannel receiver();
}
