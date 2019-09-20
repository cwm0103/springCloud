package com.cucheng.order.Enums;

import lombok.Getter;

@Getter
public enum PayStatus {
    CREATE(0,"创建"),
    NOPAY(1,"未支付"),
    FINSH(2,"已支付");

    private Integer code;

    private String msg;

    PayStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
