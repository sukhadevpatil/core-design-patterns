package com.core.design.pattern.behavioural.observer;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println("Hello "+ this.name + ", this is notification for the new video upload.");
    }
}
