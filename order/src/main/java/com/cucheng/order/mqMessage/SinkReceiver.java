package com.cucheng.order.mqMessage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author ：cwm
 * @date ：Created in 2019/7/7 23:33
 * @description：stream test
 * @modified By：
 * @version: 1.0$
 */
//@EnableBinding(Sink.class)
//@Slf4j
//public class SinkReceiver {
//    @StreamListener(Sink.INPUT)
//    public void receive(Object payload) {
//
//        log.info("Received: " + payload);
//    }
//
//}
