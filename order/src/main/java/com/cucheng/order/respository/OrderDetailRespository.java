package com.cucheng.order.respository;

import com.cucheng.order.dataObject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRespository extends JpaRepository<OrderDetail,Integer> {

}
