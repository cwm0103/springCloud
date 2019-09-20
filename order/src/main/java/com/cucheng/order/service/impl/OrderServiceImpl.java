package com.cucheng.order.service.impl;

import com.cucheng.order.Enums.OrderStatus;
import com.cucheng.order.Enums.PayStatus;
import com.cucheng.order.dataObject.OrderMaster;
import com.cucheng.order.dto.OrderDto;
import com.cucheng.order.respository.OrderDetailRespository;
import com.cucheng.order.respository.OrderMasterRespository;
import com.cucheng.order.service.OrderService;
import com.cucheng.order.utils.uuidkey;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMasterRespository orderMasterRespository;

    @Autowired
    private OrderDetailRespository orderDetailRespository;

    @Override
    public OrderDto create(OrderDto orderDto) {


        //TODO 调用商品服务
        /**
         * 计算总价
         * 扣库存
         */
        // 订单入库

        OrderMaster orderMaster=new OrderMaster();
        orderDto.setOrderId(uuidkey.getKey());
        BeanUtils.copyProperties(orderDto,orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setPayStatus(PayStatus.FINSH.getCode());
        orderMaster.setOrderStatus(OrderStatus.SUCCESS.getCode());

        OrderMaster save = orderMasterRespository.save(orderMaster);
        return orderDto;
    }
}
