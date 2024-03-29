package com.cucheng.product.repository;

import com.cucheng.product.dataObject.ProductInfo;
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
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;
    @Test
    public void findByProductStatus() {
        List<ProductInfo> list = repository.findByProductStatus(0);
        Assert.assertTrue(list.size()>0);
    }

    @Test
    public void findByProductIdIn() {
        List<ProductInfo> byProductIdIn = repository.findByProductIdIn(Arrays.asList("157875196366160022", "157875227953464068"));
        Assert.assertTrue(byProductIdIn.size()>0);
    }
}