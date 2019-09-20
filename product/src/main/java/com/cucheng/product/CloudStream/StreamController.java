package com.cucheng.product.CloudStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：cwm
 * @date ：Created in 2019/7/9 19:29
 * @description：Stream发送测试
 * @modified By：
 * @version: 1.0$
 */
//@EnableBinding(StreamOupt.class)
//@RestController
//public class StreamController {
//
////    @Autowired
////    private StreamOupt streamOupt;
////
////    @GetMapping("test")
////    public void StreamSend()
////    {
////        User u=new User();
////        u.setAge(30);
////        u.setName("陈王明");
////        streamOupt.Output().send(MessageBuilder.withPayload(u).build());
////    }
//
//
//}
