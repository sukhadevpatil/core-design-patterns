package com.core.design.pattern.creational.abstractFactory;

public class Manager implements Employee {
    @Override
    public int salary() {
        return 88888888;
    }

    @Override
    public String name() {
        System.out.println("Manager");
        return null;
    }
}
