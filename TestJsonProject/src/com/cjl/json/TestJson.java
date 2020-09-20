package com.cjl.json;

import com.google.gson.Gson;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestJson {
    public static void main(String[] args) {
        TestJson.mapToStr();
        TestJson.beanToStr();
        TestJson.listToStr();
    }

    private static void listToStr() {
        Map<String,Object> dateMap = new LinkedHashMap<>();
        dateMap.put("userid",1);
        dateMap.put("username","admin");
        dateMap.put("password","123456");
        Gson gson = new Gson();
        String jsonString = gson.toJson(dateMap);
        System.out.println(dateMap);
        System.out.println(jsonString);
    }

    private static void beanToStr() {
        
    }

    private static void mapToStr() {

    }
}
