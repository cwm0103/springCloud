package com.cucheng.order.feign;

import com.cucheng.order.dataObject.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "product")
public interface ProductController {

    @GetMapping("/product/listByOrder")
    List<ProductInfo> getProductList();
}
