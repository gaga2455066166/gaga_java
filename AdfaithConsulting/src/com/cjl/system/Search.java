package com.cjl.system;

import java.util.List;
import java.util.Scanner;


public class Search {
    public static void search(List<Employee> employees) {
        Scanner sc = new Scanner(System.in);
        String keyword;
        do {
            System.out.print("请键入关键字：");
            keyword = sc.nextLine();
            if (keyword.equals("")) {
                System.out.println("没有输入关键字，请重试。");
            } else {
                boolean isFind = false;
                for (Employee employee : employees) {
                    if (employee.getFirstName().toLowerCase().contains(keyword.toLowerCase()) 
                    		|| employee.getLastName().toLowerCase().contains(keyword.toLowerCase())) {
                        System.out.println(employee.format());
                        isFind = true;
                    }
                }
                if (!isFind) {
                    System.out.println("关键字 " + keyword + " - 没有找到。");
                }
                System.out.println("按回车键继续。。。");
                String ensure = sc.nextLine();
            }
        } while (keyword.equals(""));
    }
}
