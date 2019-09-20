package com.cucheng.product.service;

import com.cucheng.product.dataObject.ProductCategory;

import java.util.List;

public interface CategroyService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
