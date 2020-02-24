package com.cjl.system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EmployeeManager {
    List<Employee> employees = new ArrayList<Employee>();

    public EmployeeManager() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        employees.add(new Employee("Williams", "Nick", "T", "111", "02-98781999", 35, "Computer Officer", sdf.parse("14-10-2000")));
        employees.add(new Employee("Brown", "Sarah", "B", "112", "02-99893878", 12, "Electrician", sdf.parse("09-02-1992")));
        employees.add(new Employee("Couch", "David", "A", "131", "02-95673456", 26, "Consultant", sdf.parse("23-04-1994")));
        employees.add(new Employee("Anderson", "Sarah", "K", "236", "02-95437869", 19, "CEO", sdf.parse("21-09-1988")));
        employees.add(new Employee("Coles", "David", "M", "553", "03-99999999", 12, "Manager", sdf.parse("12-12-1999")));
        employees.add(new Employee("Jones", "Sarah", "B", "869", "02-95671660", 45, "Sales Manager", sdf.parse("14-12-1995")));
        employees.add(new Employee("Smith", "John", "C", "148", "02-93272658", 43, "Technical Manager", sdf.parse("21-10-1988")));
        employees.add(new Employee("Miller", "Sam", "B", "372", "02-12345678", 22, "Engineer", sdf.parse("12-03-1998")));
        employees.add(new Employee("Chen", "Xiao", "Y", "059", "02-95673455", 26, "Consultant", sdf.parse("01-05-2003")));
        employees.add(new Employee("Xue", "Fei", "L", "812", "02-98781987", 35, "Computer Officer", sdf.parse("10-08-1998")));
        employees.add(new Employee("Wang", "Mengjie", "X", "619", "02-95436669", 26, "Consultant", sdf.parse("12-02-2001")));
    }

    public void start() throws ParseException {
        String choose;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    Display.showEmployees(employees);
                    break;
                case "2":
                    Display.showEmployeesFormatted(employees);
                    break;
                case "3":
                    Display.showNameAndPhoneNumber(employees);
                    break;
                case "4":
                    Display.showNameAndPhoneNumberFormatted(employees);
                    break;
                case "5":
                    Search.search(employees);
                    break;
                case "6":
                    Add.add(employees);
                    break;
                case "7":
                    Delete.delete(employees);
                    break;
                case "Q":
                    break;
                case "":
                    System.out.println("No selection entered. Press Enter to continue鈥�");
                    choose = sc.nextLine();
                    break;
                default:
                    System.out.println("Invalid code! Press Enter to continue鈥�");
                    choose = sc.nextLine();
                    break;
            }
        } while (!choose.equals("Q"));
    }

    public void menu() {
        System.out.println("1 - Print All Current Records\n" +
                "2 鈥� Print All Current Records (formatted)\n" +
                "3 鈥� Print Names and Phone Numbers\n" +
                "4 鈥� Print Names and Phone Numbers (formatted)\n" +
                "5 - Search for specific Record(s)\n" +
                "6 - Add New Records\n" +
                "7 鈥� Delete Records\n" +
                "\n" +
                "Q - Quit\n");
        System.out.print("Your Selection: ");
    }


}
