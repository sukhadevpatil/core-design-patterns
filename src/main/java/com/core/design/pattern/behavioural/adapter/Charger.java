package com.core.design.pattern.behavioural.adapter;

public class Charger implements IphoneCharger {
    @Override
    public void chargePhone() {
        System.out.println("Charging Iphone...!!!");
    }
}
