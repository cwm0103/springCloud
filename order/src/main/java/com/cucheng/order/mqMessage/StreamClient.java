package com.cucheng.order.mqMessage;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Cloud Stream
 */
public interface StreamClient {
//    String INPUT="myCwm";
    String OUTPUT="outputProduct";

//    @Input(StreamClient.INPUT)
//    SubscribableChannel input();

    @Output(StreamClient.OUTPUT)
    MessageChannel output();

}
