package com.cjl.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.Objects;

public class JsoupDemo1 {
    public static void main(String[] args) {
        String path = Objects.requireNonNull(JsoupDemo1.class.getClassLoader().getResource("student.xml")).getPath();
        try {
            path = java.net.URLDecoder.decode(path, "utf-8");
            Document document = Jsoup.parse(new File(path), "utf-8");
            Elements elements = document.getElementsByTag("name");
            System.out.println(elements.size());
            Element element = elements.get(0);
            String text = element.text();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
