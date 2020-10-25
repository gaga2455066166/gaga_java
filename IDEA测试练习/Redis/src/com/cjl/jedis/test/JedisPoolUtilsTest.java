package com.cjl.jedis.test;

import com.cjl.jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisPoolUtilsTest {

    @Test
    public void Test1(){
        System.out.println("JedisPoolUtils");
        Jedis jedis = JedisPoolUtils.getJedis();
        jedis.set("JedisPoolUtils","ok");
        jedis.close();
    }
}
