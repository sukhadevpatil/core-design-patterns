package com.core.design.pattern.creational.abstractFactory;

public class Client {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new EmpWebDevFactory());
        employee.name();

        Employee employee2 = EmployeeFactory.getEmployee(new EmpAndroidFactory());
        employee2.name();

        Employee employee3 = EmployeeFactory.getEmployee(new ManagerFactory());
        employee3.name();
    }
}
