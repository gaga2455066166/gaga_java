package com.cjl.dao;

import com.cjl.domain.Commodity;

import java.io.UnsupportedEncodingException;
import java.util.List;

public interface CommodityDao {
    Commodity selectCommodityByNid(Integer nid);

    List<Commodity> selectAllCommodity();

    int insertCommodity(Commodity commodity);

    int updateCommoditySindex(Integer nid, String value);

    List<Commodity> selectCommodityBySindex(String sindex);

    List<Commodity> selectCommodityBySmaxid(String smaxid);

    int updateCommodity(Commodity commodity);

    List<Commodity> selectCommodityBySname(String sname);
}
