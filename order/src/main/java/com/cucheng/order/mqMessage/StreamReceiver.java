package com.cucheng.order.mqMessage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author ：cwm
 * @date ：Created in 2019/7/7 22:30
 * @description：Stream的接收方
 * @modified By：
 * @version: 1.0$
 */
//@Component
//@EnableBinding(StreamClient.class)
//@Slf4j
//public class StreamReceiver {
//
////    @StreamListener(StreamClient.INPUT)
////    @SendTo(StreamClient.OUTPUT)
////    public String  process(User user)
////    {
////        log.info("StreamReceiver {}",user);
////        return "cwm tset";
////    }
////
////    @StreamListener(StreamClient.OUTPUT)
////    //@SendTo(StreamClient.OUTPUT)
////    public  void processInput(String object)
////    {
////        log.info("StreamReceiver111 {}",object);
////    }
//}
