package com.cucheng.order.Enums;

import lombok.Getter;

@Getter
public enum OrderStatus {

    FAIL(0,"失败"),
    SUCCESS(1,"成功"),
    CREATE(2,"创建");

    private Integer code;

    private String msg;

    OrderStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
