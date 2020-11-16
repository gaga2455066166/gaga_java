package com.itheima.mall.service;

import com.itheima.mall.pojo.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> findAll();

    //使用缓存技术来查询分类信息
    public String findAllByRedis();
}
