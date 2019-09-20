package com.cucheng.order.respository;

import com.cucheng.order.Enums.OrderStatus;
import com.cucheng.order.Enums.PayStatus;
import com.cucheng.order.dataObject.OrderMaster;
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
public class OrderMasterRespositoryTest {
    @Autowired
    private OrderMasterRespository respository;

    @Test
    public  void save()
    {
        OrderMaster orderMaster=new OrderMaster();

        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());
        orderMaster.setBuyerAddress("北京");
        orderMaster.setBuyerName("cwm");
        orderMaster.setBuyerOpenid("123213");
        orderMaster.setBuyerPhone("18500328373");
        orderMaster.setOrderAmount(new BigDecimal("35"));
        orderMaster.setOrderStatus(OrderStatus.CREATE.getCode());
        orderMaster.setPayStatus(PayStatus.CREATE.getCode());
        orderMaster.setOrderId("123213");
        OrderMaster save = respository.save(orderMaster);
        Assert.assertTrue(save!=null);

    }

}