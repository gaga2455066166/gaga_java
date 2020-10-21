package com.cjl.jedis.test;


import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Jedis测试String类
 */
public class JedisTest {

    @Test
    public void Test1() {
        System.out.println("Test1");
        Jedis jedis = new Jedis("localhost",6379);
        jedis.set("username","lisi李四");
        jedis.close();
    }

    @Test
    public void Test2(){
        Jedis jedis = new Jedis();
        String username = jedis.get("username");
        System.out.println(username);
    }

    @Test
    public void Test3(){
        Jedis jedis = new Jedis();
        jedis.setex("timeout",10,"这个会过期");

    }

    @Test
    public void Test4(){
        //查询test3是否真的过期
        Jedis jedis = new Jedis();
        String timeout = jedis.get("timeout");
        System.out.println(timeout);
    }
}
