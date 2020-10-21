package com.cjl.jedis.test;


import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;
import java.util.Set;

/**
 * Jedis测试String类
 */
public class JedisHashTest {

    @Test
    public void Test1() {
        System.out.println("Test1");
        Jedis jedis = new Jedis("localhost",6379);
        jedis.hset("people1","name","王有鋆");
        jedis.hset("people1","age","89");
        jedis.hset("people1","gender","man");
        jedis.hset("people1","address","福清");

        String name = jedis.hget("people1", "name");
        System.out.println(name);

        Map<String, String> people1 = jedis.hgetAll("people1");
//        System.out.println(people1);
        Set<String> keyset = people1.keySet();
        for (String key : keyset) {
            String value = people1.get(key);
            System.out.println(key + ":" + value);

        }

        jedis.close();
    }
}
