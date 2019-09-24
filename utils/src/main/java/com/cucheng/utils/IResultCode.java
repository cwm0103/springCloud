package com.cucheng.utils;

import java.io.Serializable;

/**
 * cwm
 * 2019-8-17
 * 返回接口
 */
public interface IResultCode extends Serializable {

    /**
     * 消息
     *
     * @return String
     */
    String getMessage();

    /**
     * 状态码
     *
     * @return int
     */
    int getCode();
}
