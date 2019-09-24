package com.cucheng.order.feign;

import com.cucheng.order.dataObject.ProductInfo;
import com.cucheng.utils.Result;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "product",fallback = ProductControllerFallback.class)
public interface ProductController {

    @GetMapping("/product/listByOrder")
    Result<List<ProductInfo>> getProductList();

    @GetMapping("/product/json")
    Result<JSONObject> getJsonObject();

    @GetMapping("/product/jsonArray")
    Result<JSONArray> getJsonArray();

    @GetMapping("/product/getInt")
    Result<Integer> getInt();

    @GetMapping("/product/getString")
    Result<String> getString();
}
