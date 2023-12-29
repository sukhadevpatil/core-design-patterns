package com.core.design.pattern.behavioural.adapter;

public class ABCCharger implements AndroidCharger {
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Android phone is charging...");
    }
}
