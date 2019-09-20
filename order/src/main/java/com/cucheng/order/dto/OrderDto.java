package com.cucheng.order.dto;


import com.cucheng.order.dataObject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDto {

    private String orderId;
    private String  buyerName;
    private String buyerPhone;
    private String    buyerAddress;
    private String    buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    private Date createTime;
    private Date updateTime;
    private List<OrderDetail> orderDetailList;
}
