package com.cucheng.product.repository;

import com.cucheng.product.dataObject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    /**
     * create by: cwm
     * description: 根据状态获取类别
     * create time: 2019/7/5 13:25
     * 
     *  * @Param: null
     * @return 
     */
    List<ProductInfo>  findByProductStatus(Integer ProductStatus);
    /**
     * create by: cwm
     * description: 根据产品id来获取产品
     * create time: 2019/7/5 13:30
     * 
     *  * @Param: null
     * @return 
     */
    List<ProductInfo>  findByProductIdIn(List<String> prodcutIdListt);
    
}
