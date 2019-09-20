package com.cucheng.order.controller;

import com.cucheng.order.mqMessage.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * @author ：cwm
 * @date ：Created in 2019/7/7 22:34
 * @description：Stream的发送
 * @modified By：
 * @version: 1.0$
 */
@RestController
@EnableBinding(StreamClient.class)
public class StreamController {
    @Autowired
    private StreamClient streamClient;

    @GetMapping("/stream")
    public void StreamSender(@RequestParam("id") String id)
    {

        streamClient.output().send(MessageBuilder.withPayload(id).build());
    }


}
