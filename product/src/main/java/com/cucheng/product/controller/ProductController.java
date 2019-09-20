package com.cucheng.product.controller;

import com.cucheng.product.dataObject.ProductCategory;
import com.cucheng.product.dataObject.ProductInfo;
import com.cucheng.product.enums.ProductStatusEnum;
import com.cucheng.product.service.CategroyService;
import com.cucheng.product.service.ProductService;
import com.cucheng.product.utils.ResultVMUtil;
import com.cucheng.product.viewModel.ProductInfoVM;
import com.cucheng.product.viewModel.ProductVM;
import com.cucheng.product.viewModel.ResultVM;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategroyService categroyService;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 1. 查询所有在架商品
     * 2. 获取类目type列表
     * 3. 查询类目
     * 4. 构造数据
     */
    @GetMapping("/list")
    public ResultVM list() {

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //查询所有在架商品
        List<ProductInfo> allUpProduct = productService.getAllUpProduct(ProductStatusEnum.UP.getCode());
        //获取类目type列表
        List<Integer> categoryList = allUpProduct.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());
        //     * 3. 查询类目
        List<ProductCategory> byCategoryTypeIn = categroyService.findByCategoryTypeIn(categoryList);
        //构造数据
        List<ProductVM> list = new LinkedList<>();
        for (ProductCategory productCategory : byCategoryTypeIn) {
            ProductVM productVM = new ProductVM();
            productVM.setCategoryName(productCategory.getCategoryName());
            productVM.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVM> productInfoVMList = new LinkedList<>();
            for (ProductInfo productInfo : allUpProduct) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVM productInfoVM = new ProductInfoVM();
                    BeanUtils.copyProperties(productInfo, productInfoVM);
                    productInfoVMList.add(productInfoVM);
                }
            }
            productVM.setProductInfoVMList(productInfoVMList);
            list.add(productVM);
        }

        return ResultVMUtil.success(list);
    }

    @GetMapping("/listByOrder")
    public List<ProductInfo> getProductList()
    {
        return productService.findByProductIdIn(Arrays.asList("157875196366160022","157875227953464068"));
    }

    @GetMapping("redis")
    public String redisTest()
    {
        redisTemplate.opsForValue().set("cwm","chenwangming");

        return redisTemplate.opsForValue().get("cwm");
    }



}
