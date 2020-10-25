package com.cjl.service.Impl;

import com.cjl.dao.Impl.ProvinceDaoImpl;
import com.cjl.dao.ProvinceDao;
import com.cjl.domain.Province;
import com.cjl.jedis.util.JedisPoolUtils;
import com.cjl.service.ProvinceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {

    private ProvinceDao dao = new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    @Override
    public String findAllJson() {
        //使用缓存redis，查询数据库
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");
        if (province_json == null || province_json.length() == 0) {
            //没有数据，从缓存中取
            try {
                System.out.println("redis中没有数据，转向查询数据库");
                List<Province> list = dao.findAll();
                ObjectMapper mapper = new ObjectMapper();
                province_json= mapper.writeValueAsString(list);

            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            jedis.set("province",province_json);
            jedis.close();
        }else {
            System.out.println("redis中有数据，直接取");
        }
        return province_json;
    }
}
