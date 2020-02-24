package com.cjl.system;

import java.util.List;
import java.util.Scanner;


public class Search {
    public static void search(List<Employee> employees) {
        Scanner sc = new Scanner(System.in);
        String keyword;
        do {
            System.out.print("Enter keyword: ");
            keyword = sc.nextLine();
            if (keyword.equals("")) {
                System.out.println("No keyword entered try again ");
            } else {
                boolean isFind = false;
                for (Employee employee : employees) {
                    if (employee.getFirstName().toLowerCase().contains(keyword.toLowerCase()) || employee.getLastName().toLowerCase().contains(keyword.toLowerCase())) {
                        System.out.println(employee.format());
                        isFind = true;
                    }
                }
                if (!isFind) {
                    System.out.println("Keyword " + keyword + " - not found");
                }
                System.out.println("Press Enter to continue...");
                String ensure = sc.nextLine();
            }
        } while (keyword.equals(""));
    }
}
