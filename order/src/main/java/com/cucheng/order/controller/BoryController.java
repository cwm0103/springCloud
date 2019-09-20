package com.cucheng.order.controller;

import com.cucheng.order.confing.boryConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：cwm
 * @date ：Created in 2019/7/7 14:57
 * @description：测试控制器
 * @modified By：
 * @version: 1.0$
 */
@RequestMapping
@RestController
public class BoryController {

    @Autowired
    private boryConfig boryConfig;

    @RequestMapping("/bory")
    public String getbory(){

        return "name:"+boryConfig.getName()+" age:"+boryConfig.getAge();
    }
}
