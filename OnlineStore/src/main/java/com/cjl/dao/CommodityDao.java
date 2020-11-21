package com.cjl.dao;

import com.cjl.domain.Commodity;

import java.util.List;

public interface CommodityDao {
    Commodity selectByNid(Integer nid);
    List<Commodity> selectAll();
}
