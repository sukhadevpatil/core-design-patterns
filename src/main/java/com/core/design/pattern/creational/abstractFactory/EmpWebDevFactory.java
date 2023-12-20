package com.core.design.pattern.creational.abstractFactory;

public class EmpWebDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
