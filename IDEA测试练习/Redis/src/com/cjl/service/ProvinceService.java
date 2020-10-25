package com.cjl.service;

import com.cjl.domain.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();
    String findAllJson();
}
