package com.example.java.week4.hospitalParser;

public class Hospital {
    private String name;
    private String webSiteAddr;
    private Address address;

    public Hospital(String name, String webSiteAddr, Address address) {
        this.name = name;
        this.webSiteAddr = webSiteAddr;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getWebSiteAddr() {
        return webSiteAddr;
    }

    public Address getAddress() {
        return address;
    }
}
