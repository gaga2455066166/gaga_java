package com.cjl.jedis.test;


import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Jedis测试String类
 */
public class JedisListTest {

    @Test
    public void Test1() {
        System.out.println("Test1");
        Jedis jedis = new Jedis("localhost",6379);

        //从左右存数据
        jedis.lpush("testList","1","2");
        jedis.rpush("testList","a","b");
        List<String> testList = jedis.lrange("testList", 0, -1);
        System.out.println(testList);

        //弹出
        String a = jedis.lpop("testList");
        String b = jedis.rpop("testList");
        System.out.println(a);
        System.out.println(b);
        List<String> testList2 = jedis.lrange("testList", 0, -1);
        System.out.println(testList2);

        jedis.close();
    }
}
