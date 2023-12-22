package com.core.design.pattern.behavioural.observer;

public interface Subject {
    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    void newVideoUploaded(Observer observer);

}
