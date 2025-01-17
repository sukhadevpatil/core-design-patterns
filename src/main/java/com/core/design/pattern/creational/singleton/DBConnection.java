package com.core.design.pattern.creational.singleton;

import java.io.Serial;
import java.io.Serializable;

public class DBConnection implements Serializable, Cloneable {

    private static volatile DBConnection dbConnection = null; //lazy initialization
    // private static DBConnection dbConnection = new DBConnection(); //eager initialization

    private DBConnection() {
        if(dbConnection != null) {
            throw new RuntimeException("Trying to break singleton pattern");
        }
    }

    public static DBConnection getInstance() {
        if(dbConnection == null) {
            synchronized (DBConnection.class) {
                if(dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }

    @Serial
    public Object readResolve() {
        return dbConnection;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
