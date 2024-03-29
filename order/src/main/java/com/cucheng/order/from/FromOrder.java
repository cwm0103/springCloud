package com.cucheng.order.from;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
@Data
public class FromOrder {

    @NotEmpty(message = "姓名必填")
    private  String name;

    @NotEmpty(message = "手机号必填")
    private String phome;

    @NotEmpty(message = "地址必填")
    private String address;

    @NotEmpty(message = "买家微信号必填")
    private String openid;

    @NotEmpty(message = "购物车不能为空")
    private String items;

}
