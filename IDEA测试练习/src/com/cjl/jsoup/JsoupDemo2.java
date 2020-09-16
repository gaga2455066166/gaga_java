package com.cjl.jsoup;

import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class JsoupDemo2 {
    public static void main(String[] args) {
        String path = Objects.requireNonNull(JsoupDemo2.class.getClassLoader().getResource("student.xml")).getPath();
        try {
            path = java.net.URLDecoder.decode(path, "utf-8");
            Document document = Jsoup.parse(new File(path), "utf-8");
            JXDocument jxDocument = new JXDocument(document);
            List<JXNode> jxNodes = jxDocument.selN("//student");
            for (JXNode jxNode : jxNodes) {
                System.out.println(jxNode);
            }

            System.out.println("---------------------------");
            List<JXNode> jxNodes1 = jxDocument.selN("//student//name");
            for (JXNode jxNode1 : jxNodes1) {
                System.out.println(jxNode1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
