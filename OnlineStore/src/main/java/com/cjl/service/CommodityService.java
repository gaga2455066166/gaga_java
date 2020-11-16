package com.cjl.service;

import com.cjl.domain.Commodity;

import java.util.List;

public interface CommodityService {
    List<Commodity> commodityList();
    Commodity findCommodityByNid(Integer nid);
}
