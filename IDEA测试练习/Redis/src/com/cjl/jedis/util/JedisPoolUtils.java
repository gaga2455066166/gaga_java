package com.cjl.jedis.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JedisPoolUtils {
    /**
     * jedispool工具类
     */
    private static JedisPool jedisPool;

    static {
        //读取配置文件
        try {
            InputStream is = JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
            Properties pro = new Properties();
            pro.load(is);
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(Integer.parseInt(pro.getProperty("maxTotal")));
            config.setMaxIdle(Integer.parseInt(pro.getProperty("maxIdle")));
            jedisPool = new JedisPool(config,pro.getProperty("host"),Integer.parseInt(pro.getProperty("port")));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Jedis getJedis() {
        return jedisPool.getResource();
    }
}
