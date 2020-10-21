package com.cjl.jedis.test;


import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Jedis测试String类
 */
public class JedisSortedSetTest {

    @Test
    public void Test1() {
        System.out.println("TestSortedSet");
        Jedis jedis = new Jedis("localhost",6379);
        jedis.zadd("mySortedSet",46,"王有鋆");
        jedis.zadd("mySortedSet",69,"龚佳煌");
        jedis.zadd("mySortedSet",58,"陈进龙");

        Set<String> mySortedSet = jedis.zrange("mySortedSet", 0, -1);
        System.out.println(mySortedSet);


        jedis.close();
    }
}
