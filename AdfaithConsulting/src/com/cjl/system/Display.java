package com.cjl.system;

import java.util.List;
import java.util.Scanner;



public class Display {
    public static void showEmployees(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        ensure();
    }

    public static void showEmployeesFormatted(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).format());
        }
        ensure();
    }

    public static void showNameAndPhoneNumber(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println(employee.getLastName() + "," 
            + employee.getFirstName() + "," 
            		+ employee.getTelephoneNumber());
        }
        ensure();
    }

    public static void showNameAndPhoneNumberFormatted(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println(format(employee.getLastName()) + 
            		format(employee.getFirstName()) + 
            		employee.getTelephoneNumber());
        }
        ensure();
    }

    public static String format(String str) {
        int len = str.length();
        for (int i = 0; i < 20 - len; i++) {
            str = str + " ";
        }
        return str;
    }

    public static void ensure() {
        Scanner sc = new Scanner(System.in);
        System.out.print("按回车键继续。。。");
        String ensure = sc.nextLine();
    }
}
