package com.cucheng.order.converter;

import com.cucheng.order.Enums.ResultEnum;
import com.cucheng.order.dataObject.OrderDetail;
import com.cucheng.order.dto.OrderDto;
import com.cucheng.order.execption.OrderExecption;
import com.cucheng.order.from.FromOrder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Slf4j
public class FromOrder2OrderDTO {

    public static OrderDto convert(FromOrder fromOrder) {
        Gson gson = new Gson();
        OrderDto orderDto = new OrderDto();
        orderDto.setBuyerName(fromOrder.getName());
        orderDto.setBuyerAddress(fromOrder.getAddress());
        orderDto.setBuyerOpenid(fromOrder.getOpenid());
        orderDto.setBuyerPhone(fromOrder.getPhome());

        List<OrderDetail> orderDetailList = new ArrayList<>();

        try {
            orderDetailList= gson.fromJson(fromOrder.getItems(), new TypeToken<List<OrderDetail>>() {
            }.getType());
        } catch (Exception e) {
            log.error("【转换出错】，String={}",fromOrder.getItems());
            throw new  OrderExecption(ResultEnum.PARAM_ERROR);
        }
        orderDto.setOrderDetailList(orderDetailList);
        return orderDto;
    }
}
