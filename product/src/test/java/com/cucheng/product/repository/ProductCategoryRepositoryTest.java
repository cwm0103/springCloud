package com.cucheng.product.repository;

import com.cucheng.product.dataObject.ProductCategory;
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
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository categoryRepository;

    @Test
    public void findByCategoryTypeIn() {

        List<ProductCategory> byCategoryTypeIn = categoryRepository.findByCategoryTypeIn(Arrays.asList(11, 12));
        Assert.assertTrue(byCategoryTypeIn.size()>0);
        System.out.println(byCategoryTypeIn);
    }
}