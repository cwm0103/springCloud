package com.cucheng.product.service.impl;

import com.cucheng.product.dataObject.ProductInfo;
import com.cucheng.product.enums.ProductStatusEnum;
import com.cucheng.product.repository.ProductInfoRepository;
import com.cucheng.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    /**
     * 获取在架商品
     *
     * @param status
     * @return
     */
    @Override
    public List<ProductInfo> getAllUpProduct(Integer status) {

        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    /**
     * create by: cwm
     * description: 根据产品id来获取相关产品
     * create time: 2019/7/5 13:36
     * <p>
     * * @Param: null
     *
     * @return
     */
    @Override
    public List<ProductInfo> findByProductIdIn(List<String> prodcutIdListt) {

        return productInfoRepository.findByProductIdIn(prodcutIdListt);
    }
}
