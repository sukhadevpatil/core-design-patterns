package com.core.design.pattern.behavioural.observer;

public class Test {
    public static void main(String[] args) {
        Subject subject = new YouTubeChannel();

        Observer subscriber1 = new Subscriber("Aman");
        subject.subscribe(subscriber1);

        Subscriber subscriber2 = new Subscriber("Raman");
        subject.subscribe(subscriber2);

        subject.newVideoUploaded(subscriber1);
    }
}
