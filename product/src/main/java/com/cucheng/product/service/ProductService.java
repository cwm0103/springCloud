package com.cucheng.product.service;

import com.cucheng.product.dataObject.ProductInfo;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有在架商品
     * @return
     */
    List<ProductInfo> getAllUpProduct(Integer status);
    /**
     * create by: cwm
     * description: 根据产品id来获取相关产品
     * create time: 2019/7/5 13:36
     * 
     *  * @Param: null
     * @return 
     */
    List<ProductInfo>  findByProductIdIn(List<String> prodcutIdListt);
}
