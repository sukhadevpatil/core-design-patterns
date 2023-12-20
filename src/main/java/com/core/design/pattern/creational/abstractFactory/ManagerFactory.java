package com.core.design.pattern.creational.abstractFactory;

public class ManagerFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
