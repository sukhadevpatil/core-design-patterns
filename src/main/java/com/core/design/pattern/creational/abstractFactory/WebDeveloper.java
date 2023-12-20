package com.core.design.pattern.creational.abstractFactory;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        return 9999999;
    }

    @Override
    public String name() {
        System.out.println("Web Developer");
        return null;
    }
}
