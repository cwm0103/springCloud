package com.cucheng.product.CloudStream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author ：cwm
 * @date ：Created in 2019/7/18 11:09
 * @description：Stream接受消息
 * @modified By：
 * @version: 1.0$
 */
@Component
@EnableBinding(StreamOupt.class)
@Slf4j
public class StreamJieShou {

    @StreamListener(StreamOupt.INPUT)
    //@SendTo(StreamClient.OUTPUT)
    public  void processInput(String object)
    {
        log.info("StreamReceiver111 {}",object);
    }

}
