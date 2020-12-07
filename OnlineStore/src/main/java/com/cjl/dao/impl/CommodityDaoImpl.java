package com.cjl.dao.impl;

import com.cjl.dao.CommodityDao;
import com.cjl.domain.Commodity;
import com.cjl.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.UnsupportedEncodingException;
import java.util.List;

public class CommodityDaoImpl implements CommodityDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public Commodity selectCommodityByNid(Integer nid) {
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
    public List<Commodity> selectAllCommodity() {
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

    @Override
    public int insertCommodity(Commodity commodity) {
        String sql = "insert into commodity(nid, sname, sdescription, nprice, simg, smctag, dcdate, smaxid, sminid) " +
                " values (?,?,?,?,?,?,?,?,?)";
        int insert = template.update(sql,
                commodity.getNid(),
                commodity.getSname(),
                commodity.getSdescription(),
                commodity.getNprice(),
                commodity.getSimg(),
                commodity.getSmctag(),
                commodity.getDcdate(),
                commodity.getSmaxid(),
                commodity.getSminid()
        );
        return insert;
    }

    @Override
    public int updateCommoditySindex(Integer nid, String value) {
        String sql = "update commodity set sindex = ? where nid = ?";
        return template.update(sql, value, nid);
    }

    @Override
    public List<Commodity> selectCommodityBySindex(String sindex) {
        String sql = "select * from commodity where sindex = ?";
        List<Commodity> commodityList = null;
        try {
            commodityList = template.query(sql, new BeanPropertyRowMapper<>(Commodity.class), sindex);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the database!");
            return null;
        }
        return commodityList;
    }

    @Override
    public List<Commodity> selectCommodityBySmaxid(String smaxid) {
        String sql = "select * from commodity where smaxid = ?";
        List<Commodity> commodityList = null;
        try {
            commodityList = template.query(sql, new BeanPropertyRowMapper<>(Commodity.class), smaxid);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the database!");
            return null;
        }
        return commodityList;
    }

    @Override
    public int updateCommodity(Commodity c) {
        String sql = "update commodity set " +
                "sname = ? , sdescription = ? , nprice = ? , dcdate = ? , smaxid = ? ,sminid = ? ,sindex= ? " +
                " where nid = ?";
        int update = 0;
        try {
            update = template.update(sql, c.getSname(), c.getSdescription(), c.getNprice(), c.getDcdate(), c.getSmaxid(), c.getSminid(), c.getSindex(), c.getNid());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

        return update;
    }

    @Override
    public List<Commodity> selectCommodityBySname(String sname) {
        String sql = "select * from commodity where sname = ?";
        List<Commodity> commodityList = null;
        try {
            commodityList = template.query(sql, new BeanPropertyRowMapper<>(Commodity.class), sname);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the database!");
            return null;
        }
        System.out.println(commodityList);
        return commodityList;
    }
}
