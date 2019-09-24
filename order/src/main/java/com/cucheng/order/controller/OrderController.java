package com.cucheng.order.controller;

import com.cucheng.order.Enums.ResultEnum;
import com.cucheng.order.converter.FromOrder2OrderDTO;
import com.cucheng.order.dataObject.ProductInfo;
import com.cucheng.order.dto.OrderDto;
import com.cucheng.order.execption.OrderExecption;
import com.cucheng.order.feign.ProductController;
import com.cucheng.order.from.FromOrder;
import com.cucheng.order.service.OrderService;
import com.cucheng.order.utils.ResultUtils;
import com.cucheng.order.viewModel.ResultVM;
import com.cucheng.utils.Result;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderController {

//    @Value("${env}")
//    private String env;
    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductController productController;
    /**
     * 1. 参数校验
     * 2. 查询商品信息（调用商品服务）
     * 3. 计算总价
     * 4. k扣库存
     * 5. 订单入库
     */
    @PostMapping("/add")
    public ResultVM<Map<String,String>> create(@Valid FromOrder fromOrder,
                           BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            log.error("【创建订单】，参数不正确 ，fromOrder={}",fromOrder);
            throw new OrderExecption(ResultEnum.PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
        //fromOrder-> OrderDto
        OrderDto orderDto= FromOrder2OrderDTO.convert(fromOrder);
        if(CollectionUtils.isEmpty( orderDto.getOrderDetailList()))
        {
            log.error("【购物车为空】");
            throw new OrderExecption(ResultEnum.CART_ERROR);
        }
        OrderDto result = orderService.create(orderDto);

        Map<String,String> map=new HashMap<>();

        map.put("orderId",result.getOrderId());
        return ResultUtils.success(map);
    }

    @GetMapping("/plist")
    public Result<List<ProductInfo>>  getProductInfoList()
    {
        return  productController.getProductList();

    }

//    @GetMapping("/evn")
//    public String getEnv()
//    {
//        return env;
//    }

    @GetMapping("/json")
    public Result<JSONObject> getJson()
    {
        return  productController.getJsonObject();
    }

    @GetMapping("jsonArray")
    public Result<JSONArray> getArray()
    {
        return productController.getJsonArray();
    }

    @GetMapping("int")
    public Result<Integer> getInt()
    {
       return productController.getInt();
    }

    @GetMapping("String")
    public Result<String> getString()
    {
        return productController.getString();
    }
}
