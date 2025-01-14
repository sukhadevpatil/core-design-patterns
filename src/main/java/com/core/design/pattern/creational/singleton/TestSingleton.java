package com.core.design.pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Following snippet would help to understand that, even multiple threads trying to access
 * Singleton class, it will create a single object only
 */
public class TestSingleton {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);

        service.submit(new Task());
        service.submit(new Task());
        service.submit(new Task());
        service.submit(new Task());
        service.submit(new Task());

        service.close();
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        //System.out.println("Start===========" + Thread.currentThread().getName());
        DBConnection connection = DBConnection.getInstance();
        System.out.println(Thread.currentThread().getName() + " ==> " + connection.hashCode());
        //System.out.println("End===========" + Thread.currentThread().getName());
    }
}
