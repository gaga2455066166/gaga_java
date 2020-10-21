package com.cjl.test;

import com.cjl.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.util.*;

public class JsonTest {

    @Test
    public void test1() {
//        System.out.println("ssss");
        Person person = new Person();
        person.setAge(1);
        person.setGender("man");
        person.setName("ggg");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String s = mapper.writeValueAsString(person);
            System.out.println(s);

//            mapper.writeValue(new File("d://a.txt"),person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
//        System.out.println("ssss");
        Person person = new Person();
        person.setAge(1);
        person.setGender("man");
        person.setName("ggg");
        person.setBirthday(new Date());

        ObjectMapper mapper = new ObjectMapper();
        try {
            String s = mapper.writeValueAsString(person);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test3() {

        Person person1 = new Person();
        person1.setAge(1);
        person1.setGender("man");
        person1.setName("ggg");
        person1.setBirthday(new Date());

        Person person2 = new Person();
        person2.setAge(1);
        person2.setGender("man");
        person2.setName("ggg");
        person2.setBirthday(new Date());

        Person person3 = new Person();
        person3.setAge(1);
        person3.setGender("man");
        person3.setName("ggg");
        person3.setBirthday(new Date());

        try {
            List<Person> ps = new ArrayList<>();
            ps.add(person1);
            ps.add(person2);
            ps.add(person3);
            ObjectMapper mapper = new ObjectMapper();
            String s = mapper.writeValueAsString(ps);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test4() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "李四");
        map.put("age", "12");
        map.put("gender", "man");
        map.put("address", "福建");

        try {
            ObjectMapper mapper = new ObjectMapper();
            String s = mapper.writeValueAsString(map);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test5() {
        try {
            String json = "{\"gender\":\"man\",\"name\":\"李四\",\"age\":\"12\"}";
            ObjectMapper mapper = new ObjectMapper();
            Person person = mapper.readValue(json, Person.class);
            System.out.println(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
