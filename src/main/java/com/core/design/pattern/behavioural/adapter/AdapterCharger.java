package com.core.design.pattern.behavioural.adapter;

public class AdapterCharger implements IphoneCharger {

    private AndroidCharger charger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.charger = androidCharger;
    }

    @Override
    public void chargePhone() {
        System.out.println("Charging phone with adapter");
        charger.chargeAndroidPhone();
    }
}
