package com.core.design.pattern.creational.factory;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee("Web Developer");
        assert employee1 != null;
        System.out.println(employee1.salary());

        Employee employee2 = EmployeeFactory.getEmployee("Android Developer");
        assert employee2 != null;
        System.out.println(employee2.salary());
    }
}
