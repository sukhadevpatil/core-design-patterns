package com.core.design.pattern.creational;

public class DBConnection {

    //private static DBConnection dbConnection = null; //lazy initialization
    private static DBConnection dbConnection = new DBConnection(); //eager initialization

    private DBConnection() {}

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
}
