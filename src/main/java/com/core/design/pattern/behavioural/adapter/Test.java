package com.core.design.pattern.behavioural.adapter;

public class Test {
    public static void main(String[] args) {

       // IphoneCharger iphoneCharger = new Charger();

        IphoneCharger charger = new AdapterCharger(new ABCCharger());
        Iphone iphone = new Iphone(charger);
        iphone.chargeIphone();
    }
}
