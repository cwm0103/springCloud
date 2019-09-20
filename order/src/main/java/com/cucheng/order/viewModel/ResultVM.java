package com.cucheng.order.viewModel;

import lombok.Data;

@Data
public class ResultVM<T> {

    private  Integer code;

    private   String msg;

    private  T data;
}
