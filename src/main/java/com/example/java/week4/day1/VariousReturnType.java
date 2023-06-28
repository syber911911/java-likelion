package com.example.java.week4.day1;

public class VariousReturnType {
    public boolean isAdult() {
        return true;
    }

    public int plus() {
        return 1 + 1;
    }

    public User getUser() {
        return new User(null, null, 0);
    }

    public void printHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        VariousReturnType vrt = new VariousReturnType();
        boolean isAdult = vrt.isAdult();
        int plus = vrt.plus();
        User user = vrt.getUser();
        vrt.printHello();
    }
}
