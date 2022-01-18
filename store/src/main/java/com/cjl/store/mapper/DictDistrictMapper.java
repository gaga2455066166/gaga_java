package com.cjl.store.mapper;

import com.cjl.store.pojo.DictDistrict;

public interface DictDistrictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictDistrict record);

    int insertSelective(DictDistrict record);

    DictDistrict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictDistrict record);

    int updateByPrimaryKey(DictDistrict record);
}