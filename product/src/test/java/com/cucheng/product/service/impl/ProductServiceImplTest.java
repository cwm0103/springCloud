package com.cucheng.product.service.impl;

import com.cucheng.product.dataObject.ProductInfo;
import com.cucheng.product.enums.ProductStatusEnum;
import com.cucheng.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductServiceImplTest {

    @Autowired
    private ProductService productService;
    @Test
    public void getAllUpProduct() {

        List<ProductInfo> allUpProduct = productService.getAllUpProduct(ProductStatusEnum.UP.getCode());
        Assert.assertTrue(allUpProduct.size()>0);
    }
}