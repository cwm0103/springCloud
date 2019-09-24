package com.cucheng.order.feign;

import com.cucheng.order.dataObject.ProductInfo;
import com.cucheng.utils.Result;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ：cwm
 * @date ：Created in 2019/9/24 10:43
 * @description：fegin 容错类
 * @modified By：
 * @version: 1.0$
 */
@Component
public class ProductControllerFallback implements ProductController {
    @Override
    public Result<List<ProductInfo>> getProductList() {

        List<ProductInfo> list=new ArrayList<>();
//        ProductInfo productInfo=new ProductInfo();
//        productInfo.setCreateTime(new Date());
//        productInfo.setCategoryType(1);
//        productInfo.setProductName("hystrix");
//        list.add(productInfo);
//        return list;
        return Result.data(list);
    }

    @Override
    public Result<JSONObject> getJsonObject() {

        JSONObject jsonObject=new JSONObject();
//        return jsonObject;
//        return null;
        return Result.data(201,jsonObject,"加载失败！");
    }

    @Override
    public Result<JSONArray> getJsonArray() {
        JSONArray jsonArray=new JSONArray();
        return  Result.data(jsonArray);
//        return null;
    }

    @Override
    public Result<Integer> getInt() {
//        Integer i =null;
        Integer i=0;
        return Result.data(i);
    }

    @Override
    public Result<String> getString() {
//        String str=null;
        String str="";
        return Result.data(str);
//        return null;
    }

}
