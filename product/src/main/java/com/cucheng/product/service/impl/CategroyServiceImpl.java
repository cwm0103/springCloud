package com.cucheng.product.service.impl;

import com.cucheng.product.dataObject.ProductCategory;
import com.cucheng.product.repository.ProductCategoryRepository;
import com.cucheng.product.service.CategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategroyServiceImpl implements CategroyService {
    @Autowired
    private ProductCategoryRepository categoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return categoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
