package com.core.design.pattern.creational.abstractFactory;

public class EmpAndroidFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
