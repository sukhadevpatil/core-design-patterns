package com.core.design.pattern.creational.abstractFactory;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory abstractFactory) {
        return abstractFactory.createEmployee();
    }
}
