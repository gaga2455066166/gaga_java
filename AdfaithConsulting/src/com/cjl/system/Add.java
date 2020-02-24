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
            System.out.println("Record Saved");
            System.out.println("Add another employee record? (y)es or (n)o");
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
                System.out.println("No date hired entered 鈥� try again");
            } else if (isValidDate(dateHiredStr)) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                dateHired = sdf.parse(dateHiredStr);
            } else {
                System.out.println("Invalid Date Hired");
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
            System.out.print("Enter Job Title: ");
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
            System.out.print("Enter Dept #: ");
            departmentNumStr = sc.nextLine();
            if (departmentNumStr.equals("")) {
                System.out.println("No Dept # entered 鈥� try again");
            } else if (!departmentNumStr.matches(regex)) {
                System.out.println("Dept # can contain only digits with no spaces");
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
            System.out.print("Enter Last Name: ");
            lastName = sc.nextLine();
            if (lastName.equals("")) {
                System.out.println("No last name entered 鈥� try again");
            } else if (!lastName.matches(regex)) {
                System.out.println("Last name can contain only alphabetical characters and spaces");
            }
        } while (lastName.equals("") || !lastName.matches(regex));
        do {
            System.out.print("Enter First Name: ");
            firstName = sc.nextLine();
            if (firstName.equals("")) {
                System.out.println("No First name entered 鈥� try again");
            } else if (!firstName.matches(regex)) {
                System.out.println("First name can contain only alphabetical characters and spaces");
            }
        } while (firstName.equals("") || !firstName.matches(regex));
        do {
            System.out.print("Enter Middle Init: ");
            initial = sc.nextLine();
            if (initial.equals("")) {
                System.out.println("No Middle Init entered 鈥� try again");
            } else if (!initial.matches(regex)) {
                System.out.println("Middle Init can contain only alphabetical characters and spaces");
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
            System.out.print("Enter Phone Number (02-12345678): ");
            telephoneNumber = sc.nextLine();
            if (telephoneNumber.equals("")) {
                System.out.println("No phone number entered 鈥� try again");
            } else if (!telephoneNumber.matches(regex)) {
                System.out.println("Invalid phone number 鈥� try again");
            }
        } while (telephoneNumber.equals("") || !telephoneNumber.matches(regex));
        employee.setTelephoneNumber(telephoneNumber);
    }

    private static void enterPayRollNumber(List<Employee> employees, Scanner sc, Employee employee) {
        String payrollNumber = null;
        int i = 0;
        do {
            System.out.print("Enter employee 3 digit payroll number: ");
            payrollNumber = sc.nextLine();
            if (payrollNumber.equals("")) {
                System.out.println("No payroll number entered 鈥� try again");
            } else if (!payrollNumber.matches("\\d{3}")) {
                System.out.println("Payroll number can contain only numerical characters");
            } else {
                for (i = 0; i < employees.size(); i++) {
                    if (employees.get(i).getPayrollNumber().equals(payrollNumber)) {
                        System.out.println("The payroll number already exists");
                        break;
                    }
                }
            }
        } while (payrollNumber.equals("") || !payrollNumber.matches("\\d{3}") || i < employees.size());
        employee.setPayrollNumber(payrollNumber);
    }
}
