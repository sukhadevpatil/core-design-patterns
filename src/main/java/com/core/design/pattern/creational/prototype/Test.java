package com.core.design.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.178.14.48");
        networkConnection.setData("Sample Data to Load");
        networkConnection.addDomains("www.google.com")
                .addDomains("www.tesla.com")
                .addDomains("www.advent.com")
                .addDomains("www.gof.com");


        NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
        NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();

        networkConnection.getDomains().remove("www.google.com");
        System.out.println(networkConnection);

        System.out.println(networkConnection2);
        System.out.println(networkConnection3);

    }
}
