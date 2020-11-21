package com.cjl.dao.impl;

import com.cjl.dao.CommodityDao;
import com.cjl.domain.Commodity;
import com.cjl.util.JDBCUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CommodityDaoImpl implements CommodityDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public Commodity selectByNid(Integer nid) {
        String sql = "select * from commodity where nid = ?";
        Commodity commodity = null;
        try {
            commodity = template.queryForObject(sql, new BeanPropertyRowMapper<>(Commodity.class), nid);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data for this nid: " + nid + " in the database!");
            return null;
        }
        return commodity;
    }

    @Override
    public List<Commodity> selectAll() {
        String sql = "select * from commodity";
        List<Commodity> commodityList = null;
        try {
            commodityList = template.query(sql, new BeanPropertyRowMapper<>(Commodity.class));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the database!");
            return null;
        }
        return commodityList;
    }
}
