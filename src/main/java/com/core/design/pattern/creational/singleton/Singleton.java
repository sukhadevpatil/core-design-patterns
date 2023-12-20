package com.core.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {
    public static void main1(String[] args) {
        DBConnection dbConnection1 = DBConnection.getInstance();

        System.out.println(dbConnection1.hashCode());

        DBConnection dbConnection2 = DBConnection.getInstance();

        System.out.println(dbConnection2.hashCode());

        /*
            same hashcode of previous object, i.e. same object get returned every time
         */
    }

    public static void main2(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
         Break singleton pattern by Reflection API
         */

        DBConnection dbConnection1 = DBConnection.getInstance();
        System.out.println(dbConnection1.hashCode());

        Constructor<DBConnection> constructor = DBConnection.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        DBConnection dbConnection = constructor.newInstance();

        System.out.println(dbConnection.hashCode()); // hashcode differs wrt to previous print, means created new object viz., breaks singleton pattern
    }

    /**
     * using serialization
     * @param args
     */
    public static void main3(String[] args) throws IOException, ClassNotFoundException {

        DBConnection dbConnection = DBConnection.getInstance();
        System.out.println(dbConnection.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("fis.ser"));
        oos.writeObject(dbConnection);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fis.ser"));

        DBConnection dbConnection2 = (DBConnection) ois.readObject();
        System.out.println(dbConnection2.hashCode());
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        DBConnection dbConnection = DBConnection.getInstance();
        System.out.println(dbConnection.hashCode());

        DBConnection dbConnection2 = (DBConnection) dbConnection.clone();
        System.out.println(dbConnection2.hashCode());
    }
}