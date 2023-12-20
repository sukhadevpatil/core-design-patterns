package com.core.design.pattern.creational.factory;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting class :: " + this.getClass().getName());
        return 999999999;
    }
}
