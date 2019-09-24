package com.cucheng.utils;

import org.springframework.lang.Nullable;

/**
 * @author ：cwm
 * @date ：Created in 2019/8/17 22:09
 * @description：判断对象是否为空
 * @modified By：
 * @version: 1.0$
 */
public class ObjectUtil extends org.springframework.util.ObjectUtils {

    /**
     * 判断元素不为空
     *
     * @param obj object
     * @return boolean
     */
    public static boolean isNotEmpty(@Nullable Object obj) {
        return !ObjectUtil.isEmpty(obj);
    }

}