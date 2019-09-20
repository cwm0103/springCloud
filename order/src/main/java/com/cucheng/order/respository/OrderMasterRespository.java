package com.cucheng.order.respository;

import com.cucheng.order.dataObject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRespository extends JpaRepository<OrderMaster,String> {
}
