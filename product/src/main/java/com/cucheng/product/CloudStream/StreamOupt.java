package com.cucheng.product.CloudStream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamOupt {

//    String output="myCwm";
//
//    @Output(StreamOupt.output)
//    MessageChannel Output();

    String INPUT="inputOrder";
    @Input(StreamOupt.INPUT)
    SubscribableChannel input();


}
