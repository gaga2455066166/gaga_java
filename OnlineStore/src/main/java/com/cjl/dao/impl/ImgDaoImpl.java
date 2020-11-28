package com.cjl.dao.impl;

import com.cjl.dao.ImgDao;
import com.cjl.domain.Commodity;
import com.cjl.domain.Img;
import com.cjl.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ImgDaoImpl implements ImgDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Img> selectImgByNid(Integer nid) {
        String sql = "select * from img where nid = ?";
        List<Img> imgs = null;
        try {
            imgs = template.query(sql, new BeanPropertyRowMapper<>(Img.class),nid);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the database!");
            return null;
        }
        return imgs;
    }
}
