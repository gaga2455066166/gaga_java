package com.cjl.jedis.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisPoolTest {


    @Test
    public void Test1() {
        JedisPool jedisPool = new JedisPool();
        Jedis jedis1 = jedisPool.getResource();
        jedis1.set("TestJedisPool","456465431");

        jedis1.close();
    }

}
