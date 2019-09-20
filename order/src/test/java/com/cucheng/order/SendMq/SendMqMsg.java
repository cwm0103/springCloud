package com.cucheng.order.SendMq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author ：cwm
 * @date ：Created in 2019/7/7 21:16
 * @description：发送mq消息
 * @modified By：
 * @version: 1.0$
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SendMqMsg {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void SendMsg()
    {
        rabbitTemplate.convertAndSend("myQueue", "now "+new Date());
    }

    @Test
    public void SendMsgOrder()
    {
        rabbitTemplate.convertAndSend("myExchangeOder", "cwm" ,"now "+new Date());
    }

}
