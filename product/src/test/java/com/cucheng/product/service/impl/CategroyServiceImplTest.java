package com.cucheng.product.service.impl;


import com.cucheng.product.dataObject.ProductCategory;
import com.cucheng.product.service.CategroyService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategroyServiceImplTest {
    @Autowired
    private CategroyService categroyService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> byCategoryTypeIn = categroyService.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(byCategoryTypeIn.size()>0);
    }
}