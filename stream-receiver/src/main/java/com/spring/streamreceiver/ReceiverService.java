package com.spring.streamreceiver;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(IReceiverService.class)
public class ReceiverService {
    @StreamListener("log-exchange")
    public void onReceiver(byte[] msg) {
        System.out.println("消费者接受到:" + new String(msg));
    }

}
