package com.cucheng.order.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ：cwm
 * @date ：Created in 2019/7/5 13:54
 * @description：产品类
 * @modified By：
 * @version: 1.0$
 */
//@Table(name = "product_info")
@Data
@Entity
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Integer productStatus;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
