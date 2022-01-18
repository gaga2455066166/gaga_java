package com.cjl.store.mapper;

import com.cjl.store.pojo.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}