package com.cjl.system;

import java.util.List;
import java.util.Scanner;


public class Delete {
    public static void delete(List<Employee> employees) {
        Scanner sc = new Scanner(System.in);
        String payrollNumber;
        boolean flag;
        do {
            flag = false;
            System.out.print("输入员工3位工资单号码:");
            payrollNumber = sc.nextLine();
            if (payrollNumber.equals("")) {
                System.out.println("错误，再试一次");
            } else if (!payrollNumber.matches("\\d{3}")) {
                System.out.println("工资单号只能包含数字字符。");
            } else {
                int i = 0;
                int size = employees.size();
                for (i = 0; i < size; i++) {
                    if (employees.get(i).getPayrollNumber().equals(payrollNumber)) {
                        System.out.println("请确定是否删除记录, (y)es or (n)o");
                        String ensure = sc.nextLine();
                        if (ensure.equals("y")) {
                            employees.remove(i);
                            System.out.println("记录已经删除");
                            System.out.println("删除另一个？  (y)es or (n)o");
                            ensure = sc.nextLine();
                            if (ensure.equals("y")) {
                                flag = true;
                            }
                        }
                        break;
                    }
                }
                if (i == size) {
                    System.out.println(
                            "员工工资单号" + payrollNumber + " 没有找到！\n" +
                            "\n" +
                            "按确定键继续。。。");
                    String ensure = sc.nextLine();
                }
            }
        } while (payrollNumber.equals("") || !payrollNumber.matches("\\d{3}") || flag);
    }
}
