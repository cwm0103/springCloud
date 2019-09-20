package com.cucheng.product.utils;

import com.cucheng.product.viewModel.ResultVM;

public class ResultVMUtil {

    public static ResultVM success(Object object)
    {
        ResultVM resultVM=new ResultVM();
        resultVM.setCode(0);
        resultVM.setData(object);
        resultVM.setMsg("成功！");
        return resultVM;
    }
}
