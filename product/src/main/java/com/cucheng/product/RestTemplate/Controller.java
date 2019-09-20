package com.cucheng.product.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@Slf4j
@RestController
public class Controller {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

//    @Autowired
//    private RestTemplate restTemplate;


    @GetMapping("/getOrder")
    public String getOrderMsg()
    {
        //第一种方式  ，知道访问接口的情况下 接口写死
//        RestTemplate restTemplate=new RestTemplate();
//        String forObject = restTemplate.getForObject("http://localhost:8080/msg", String.class);

        //第二种方式，利用LoadBalancerClient  利用服务的名称
        RestTemplate restTemplate=new RestTemplate();
        ServiceInstance cucheng_order = loadBalancerClient.choose("CUCHENG-ORDER");
        String url=String.format("http://%s:%s",cucheng_order.getHost(),cucheng_order.getPort())+"/msg";
        String forObject = restTemplate.getForObject(url, String.class);


        //第三种写法，利用 RestTemplate 注解 和LoadBalancer 注解
//        String forObject = restTemplate.getForObject("http://CUCHENG-ORDER/msg", String.class);
        log.info("response={}",forObject);
        return forObject;
    }
}
