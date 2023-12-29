package com.core.design.pattern.behavioural.adapter;

public class Iphone {

    private IphoneCharger iphoneCharger;

    public Iphone(IphoneCharger iphoneCharger) {
        this.iphoneCharger = iphoneCharger;
    }

    public void chargeIphone() {
        iphoneCharger.chargePhone();
    }
}
