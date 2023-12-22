package com.core.design.pattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

    List<Observer> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        this.subscriberList.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        this.subscriberList.remove(observer);
    }

    @Override
    public void newVideoUploaded(Observer observer) {
        for(Observer observer1 : subscriberList) {
            observer1.notified();
        }
    }
}
