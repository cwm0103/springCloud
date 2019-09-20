package com.cucheng.order.execption;

import com.cucheng.order.Enums.ResultEnum;

public class OrderExecption extends RuntimeException {

    private Integer code;

    private String message;

    public OrderExecption(Integer code,String message)
    {
        super(message);

        this.code=code;

    }
    public OrderExecption(ResultEnum resultEnum)
    {
        super(resultEnum.getMessage());
        this.code=code;
    }
}
