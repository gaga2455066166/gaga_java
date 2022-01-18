package com.cjl.store.mapper;

import com.cjl.store.pojo.Product_category;

public interface Product_categoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_category record);

    int insertSelective(Product_category record);

    Product_category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_category record);

    int updateByPrimaryKey(Product_category record);
}