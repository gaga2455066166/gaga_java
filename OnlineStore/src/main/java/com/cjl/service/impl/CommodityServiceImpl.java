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
        return dao.selectAllCommodity();
    }

    @Override
    public Commodity findCommodityByNid(Integer nid) {
        return dao.selectCommodityByNid(nid);
    }

    @Override
    public int AddCommodity(Commodity commodity) {
        return dao.insertCommodity(commodity);
    }

    @Override
    public int modifyCommoditySindex(Integer nid,String value) {

        return dao.updateCommoditySindex(nid,value);
    }

    @Override
    public List<Commodity> findCommodityBySindex(String sindex) {
        return dao.selectCommodityBySindex(sindex);
    }

    @Override
    public List<Commodity> findCommodityBySmaxid(String smaxid) {
        return dao.selectCommodityBySmaxid(smaxid);
    }

    @Override
    public int modifyCommodity(Commodity commodity) {
        return dao.updateCommodity(commodity);
    }
}
