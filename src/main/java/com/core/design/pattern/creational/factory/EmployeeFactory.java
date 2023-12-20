package com.core.design.pattern.creational.factory;

public class EmployeeFactory {

    public static Employee getEmployee(String empType) {
        if(empType.trim().equalsIgnoreCase("Web Developer")) {
            return new WebDeveloper();
        } else if(empType.trim().equalsIgnoreCase("Android Developer")) {
            return new AndroidDeveloper();
        }
        return null;
    }
}
