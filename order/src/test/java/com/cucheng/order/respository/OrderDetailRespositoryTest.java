package com.cucheng.order.respository;

import com.cucheng.order.dataObject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRespositoryTest {
    @Autowired
    private OrderDetailRespository respository;

    @Test
    public void save()
    {
        OrderDetail orderDetail=new OrderDetail();

        orderDetail.setUpdateTime(new Date());
        orderDetail.setCreateTime(new Date());
        orderDetail.setDetailId("12312");
        orderDetail.setProductIcon("cwm");
        orderDetail.setOrderId("123456");
        orderDetail.setProductName("18500328373");
        orderDetail.setProductPrice(new BigDecimal("20.5"));
        orderDetail.setProductId("111111");
        orderDetail.setProductQuantity(10);

        OrderDetail save = respository.save(orderDetail);
        Assert.assertTrue(save!=null);
    }

}