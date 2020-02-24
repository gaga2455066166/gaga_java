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
            System.out.print("Enter employee 3 digit payroll number: ");
            payrollNumber = sc.nextLine();
            if (payrollNumber.equals("")) {
                System.out.println("No payroll number entered 鈥� try again");
            } else if (!payrollNumber.matches("\\d{3}")) {
                System.out.println("Payroll number can contain only numerical characters");
            } else {
                int i = 0;
                int size = employees.size();
                for (i = 0; i < size; i++) {
                    if (employees.get(i).getPayrollNumber().equals(payrollNumber)) {
                        System.out.println("Confirm record deletion, (y)es or (n)o");
                        String ensure = sc.nextLine();
                        if (ensure.equals("y")) {
                            employees.remove(i);
                            System.out.println("Record deleted");
                            System.out.println("Delete another? (y)es or (n)o");
                            ensure = sc.nextLine();
                            if (ensure.equals("y")) {
                                flag = true;
                            }
                        }
                        break;
                    }
                }
                if (i == size) {
                    System.out.println("Adfaith Consulting  Employee Records:\n" +
                            "======================================\n" +
                            "\n" +
                            "Employee Record Deletion:\n" +
                            "\n" +
                            "Enter employee  3 digit payroll number to enable file deletion: " + payrollNumber + " (user input)\n" +
                            "\n" +
                            "Employee record for " + payrollNumber + " not found!\n" +
                            "\n" +
                            "Press Enter to continue ...");
                    String ensure = sc.nextLine();
                }
            }
        } while (payrollNumber.equals("") || !payrollNumber.matches("\\d{3}") || flag);
    }
}
