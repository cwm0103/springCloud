package com.cucheng.order.utils;

import com.cucheng.order.viewModel.ResultVM;

public class ResultUtils {

    public static ResultVM success(Object object)
    {
        ResultVM resultVM=new ResultVM();
        resultVM.setCode(0);
        resultVM.setData(object);
        resultVM.setMsg("创建订单成功！");
        return resultVM;
    }
}
