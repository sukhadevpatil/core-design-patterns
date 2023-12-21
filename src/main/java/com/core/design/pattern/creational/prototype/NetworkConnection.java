package com.core.design.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String data;

    private final List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws InterruptedException {
        this.data = data;
        Thread.sleep(1000);
    }

    public List<String> getDomains() {
        return domains;
    }

    public NetworkConnection addDomains(String domain) {
        this.domains.add(domain);
        return this;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();

        try {
            networkConnection.setIp(this.ip);
            networkConnection.setData(this.data);
            for(String val : this.domains) {
                networkConnection.addDomains(val);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return networkConnection;
    }
}
