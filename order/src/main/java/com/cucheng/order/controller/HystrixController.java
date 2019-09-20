package com.cucheng.order.controller;


import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



/**
 * @author ：cwm
 * @date ：Created in 2019/7/11 11:08
 * @description：Hystrix demo
 * @modified By：
 * @version: 1.0$
 */
@RestController
@RequestMapping("/hystrix")
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {

    /**
     * Hystrix  降级不仅可以使用在服务调用失败之间
     * 还可以使用在自己内部程序错误的情况下
     * @return
     */

//    @HystrixCommand(fallbackMethod = "fallback")
//    @HystrixCommand   //使用默认降级
//    @HystrixCommand(commandProperties = {
//        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "4000")
//    })//设置超时时间

    @HystrixCommand(commandProperties = {
            @HystrixProperty( name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty( name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty( name = "circuitBreaker.sleepWindowInMilliseconds",value = "3000"),
            @HystrixProperty( name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })// Hystrix 的熔断机制
    @GetMapping("/plist")
    public String getProductInfoList(@RequestParam("number") Integer number)
    {
        if(number==2)
        {
            return "cwm success";
        }

        RestTemplate restTemplate=new RestTemplate();
        // 返回String类型是可以的
        String forObject = restTemplate.getForObject("http://localhost:8081/product/list", String.class);
        return forObject;

//        throw new OrderExecption(ResultEnum.PARAM_ERROR);
    }

    private String fallback()
    {
        return "cwm text";
    }

    private String defaultFallback()
    {
        return "default cwm test";
    }
}
