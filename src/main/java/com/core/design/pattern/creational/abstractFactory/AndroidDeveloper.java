package com.core.design.pattern.creational.abstractFactory;

import com.core.design.pattern.creational.abstractFactory.Employee;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 999;
    }

    @Override
    public String name() {
        System.out.println("Android Developer");
        return null;
    }
}
