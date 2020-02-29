package com.cjl.system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Add {
    public static void add(List<Employee> employees) throws ParseException {
        Scanner sc = new Scanner(System.in);
        boolean again = true;
        do {
            Employee employee = new Employee();
            enterPayRollNumber(employees, sc, employee);
            enterTelephoneNumber(sc, employee);
            enterName(sc, employee);
            enterDepartmentNum(sc, employee);
            enterJob(sc, employee);
            enterDateHired(sc, employee);
            employees.add(employee);
            System.out.println("记录保存");
            System.out.println("添加另一个员工记录?  (y)es 或 (n)o");
            String canAgain = sc.nextLine();
            if (!canAgain.equals("y")) {
                again = false;
            }
        } while (again);
    }

    private static void enterDateHired(Scanner sc, Employee employee) throws ParseException {
        String dateHiredStr;
        Date dateHired;
        dateHired = null;
        do {
            System.out.print("Enter Date Hired (dd-mm-yyyy): ");
            dateHiredStr = sc.nextLine();
            if (dateHiredStr.equals("")) {
                System.out.println("没有检测到输入，请重新输入!");
            } else if (isValidDate(dateHiredStr)) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                dateHired = sdf.parse(dateHiredStr);
            } else {
                System.out.println("无效的日期");
            }
        } while (dateHiredStr.equals("") || dateHired == null);
        employee.setDateHired(dateHired);
    }

    private static boolean isValidDate(String dateStr) {
        if (!dateStr.matches("\\d{1,2}-\\d{1,2}-\\d{4}")) {
            return false;
        }
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dates = dateStr.split("-");
        int day = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int year = Integer.parseInt(dates[2]);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            months[1] = 29;
        }
        if (month < 1 || month > 12 || day > months[month - 1] || day < 1) {
            return false;
        }
        return true;
    }

    private static void enterJob(Scanner sc, Employee employee) {
        String job;
        String regex = "[a-zA-Z|\\s]+";
        do {
            System.out.print("输入职位: ");
            job = sc.nextLine();
            if (job.equals("")) {
                System.out.println("No Job title entered 鈥� try again");
            } else if (!job.matches(regex)) {
                System.out.println("Job title can contain only alphabetical characters and spaces");
            }
        } while (job.equals("") || !job.matches(regex));
        employee.setJob(job);
    }

    private static void enterDepartmentNum(Scanner sc, Employee employee) {
        String departmentNumStr;
        int departmentNum;
        String regex = "\\d+";
        do {
            System.out.print("输入部门 #: ");
            departmentNumStr = sc.nextLine();
            if (departmentNumStr.equals("")) {
                System.out.println("没有检测到输入，请重新输入! ");
            } else if (!departmentNumStr.matches(regex)) {
                System.out.println("部门编号只能包含没有数字的编号");
            }
        } while (departmentNumStr.equals("") || !departmentNumStr.matches(regex));
        departmentNum = Integer.parseInt(departmentNumStr);
        employee.setDepartmentNum(departmentNum);
    }

    /*杈撳叆濮撳悕*/
    private static void enterName(Scanner sc, Employee employee) {
        String lastName;
        String firstName;
        String initial;
        String regex = "[a-zA-Z|\\s]+";
        do {
            System.out.print("输入性: ");
            lastName = sc.nextLine();
            if (lastName.equals("")) {
                System.out.println("没有检测到输入，请重新输入! ");
            } else if (!lastName.matches(regex)) {
                System.out.println("姓氏只能包含字母字符和空格");
            }
        } while (lastName.equals("") || !lastName.matches(regex));
        do {
            System.out.print("输入名: ");
            firstName = sc.nextLine();
            if (firstName.equals("")) {
                System.out.println("没有检测到输入，请重新输入!");
            } else if (!firstName.matches(regex)) {
                System.out.println("名字只能包含字母和空格");
            }
        } while (firstName.equals("") || !firstName.matches(regex));
        do {
            System.out.print("输入 Middle Init: ");
            initial = sc.nextLine();
            if (initial.equals("")) {
                System.out.println("没有检测到输入，请重新输入!");
            } else if (!initial.matches(regex)) {
                System.out.println("Middle Init 只能包含字母字符和空格");
            }
        } while (initial.equals("") || !initial.matches(regex));
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setInitial(initial);
    }

  
    private static void enterTelephoneNumber(Scanner sc, Employee employee) {
        String telephoneNumber;
        String regex = "0[2-8]-[1-9]\\d{7}";
        do {
            System.out.print("输入手机号(02-12345678): ");
            telephoneNumber = sc.nextLine();
            if (telephoneNumber.equals("")) {
                System.out.println("没有检测到输入，请重新输入!");
            } else if (!telephoneNumber.matches(regex)) {
                System.out.println("非法的手机号，请重新输入");
            }
        } while (telephoneNumber.equals("") || !telephoneNumber.matches(regex));
        employee.setTelephoneNumber(telephoneNumber);
    }

    private static void enterPayRollNumber(List<Employee> employees, Scanner sc, Employee employee) {
        String payrollNumber = null;
        int i = 0;
        do {
            System.out.print("输入员工3位数工资单号码: ");
            payrollNumber = sc.nextLine();
            if (payrollNumber.equals("")) {
                System.out.println("没有检测到输入，请重新输入！");
            } else if (!payrollNumber.matches("\\d{3}")) {
                System.out.println("工资单号只能包含数字字符");
            } else {
                for (i = 0; i < employees.size(); i++) {
                    if (employees.get(i).getPayrollNumber().equals(payrollNumber)) {
                        System.out.println("工资单号码已经存在");
                        break;
                    }
                }
            }
        } while (payrollNumber.equals("") || !payrollNumber.matches("\\d{3}") || i < employees.size());
        employee.setPayrollNumber(payrollNumber);
    }
}
