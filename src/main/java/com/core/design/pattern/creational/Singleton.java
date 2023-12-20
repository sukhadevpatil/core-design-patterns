package com.core.design.pattern.creational;

public class Singleton {
    public static void main(String[] args) {
        DBConnection dbConnection1 = DBConnection.getInstance();

        System.out.println(dbConnection1.hashCode());

        DBConnection dbConnection2 = DBConnection.getInstance();

        System.out.println(dbConnection2.hashCode());

        /*
            same hashcode of previous object, i.e. same object get returned every time
         */
    }
}