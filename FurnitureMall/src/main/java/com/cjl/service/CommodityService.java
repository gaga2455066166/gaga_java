package com.cjl.service;

import com.cjl.domain.Commodity;

import java.util.List;

public interface CommodityService {
    List<Commodity> findAllCommodity();
    Commodity findCommodityByNid(Integer nid);
    int AddCommodity(Commodity commodity);
}
