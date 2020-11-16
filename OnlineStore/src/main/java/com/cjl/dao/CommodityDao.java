package com.cjl.dao;

import com.cjl.domain.Commodity;

import java.util.List;

public interface CommodityDao {
    Commodity findByNid(Integer nid);
    List<Commodity> findAllCommodity();
}
