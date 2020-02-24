package com.cjl.system;

import java.io.IOException;
import java.text.ParseException;

public class Test {
    public static void main(String[] args) throws ParseException, IOException {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.start();
    }
}
