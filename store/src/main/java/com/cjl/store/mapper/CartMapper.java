package com.cjl.store.mapper;

import com.cjl.store.pojo.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}