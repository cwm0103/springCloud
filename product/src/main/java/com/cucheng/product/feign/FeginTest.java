package com.cucheng.product.feign;





import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order")
public interface FeginTest {

    @GetMapping("/msg")
    String getMsg();

}
