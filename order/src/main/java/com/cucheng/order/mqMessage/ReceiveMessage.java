package com.cucheng.order.mqMessage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author ：cwm
 * @date ：Created in 2019/7/7 21:11
 * @description：Mq消息接受test
 * @modified By：
 * @version: 1.0$
 */
@Component
@Slf4j
public class ReceiveMessage {

//   1. 需要自己去创建myQueue  @RabbitListener(queues = "myQueue")
//   2. 自动创建队列  @RabbitListener(queuesToDeclare =  @Queue("myQueue"))
//    3. 自动创建myQueue 和 Exchange
//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue("myQueue"),
//            exchange = @Exchange("myExchange")
//    ))
//    public void ReceviceMq(String msg)
//    {
//        log.info("ReceiveMessage :{}",msg);
//    }
//
//    @RabbitListener(bindings = @QueueBinding(
//            key = "cwm",
//            value = @Queue("myOder"),
//            exchange = @Exchange("myExchangeOder")
//    ))
//    public void ReceviceMqOrder(String msg)
//    {
//        log.info("ReceiveMessageOder :{}",msg);
//    }
//
//    @RabbitListener(bindings = @QueueBinding(
//            key = "cwf",
//            value = @Queue("myProduct"),
//            exchange = @Exchange("myExchangeOder")
//    ))
//    public void ReceviceMqProduct(String msg)
//    {
//        log.info("ReceiveMessageProduct :{}",msg);
//    }

}
