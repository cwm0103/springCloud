package com.cucheng.product.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：cwm
 * @date ：Created in 2019/7/1 2:01
 * @description：Fegin测试类
 * @modified By：
 * @version: v1.0$
 */
@RestController
@Slf4j
public class FeginController {

    @Autowired
    private FeginTest feginTest;

    @GetMapping("/getOrderMsg")
    public String getOrderMsg()
    {
        String msg = feginTest.getMsg();
        log.info("fegin={}",msg);
        return msg;
    }



}
