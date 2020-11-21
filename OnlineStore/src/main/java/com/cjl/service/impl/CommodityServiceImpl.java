package com.cjl.service.impl;

import com.cjl.dao.CommodityDao;
import com.cjl.dao.impl.CommodityDaoImpl;
import com.cjl.domain.Commodity;
import com.cjl.service.CommodityService;

import java.util.List;

public class CommodityServiceImpl implements CommodityService {
    private final CommodityDao dao = new CommodityDaoImpl();

    @Override
    public List<Commodity> findAllCommodity() {
        return dao.selectAll();
    }

    @Override
    public Commodity findCommodityByNid(Integer nid) {
        return dao.selectByNid(nid);
    }
}
