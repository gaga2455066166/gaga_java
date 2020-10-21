package com.cjl.jedis.test;


import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * Jedis测试String类
 */
public class JedisSetTest {

    @Test
    public void Test1() {
        System.out.println("TestSet");
        Jedis jedis = new Jedis("localhost",6379);
        jedis.sadd("mySet", "1", "2", "3");
        Set<String> mySet = jedis.smembers("mySet");
        System.out.println(mySet);


        jedis.close();
    }
}
