package com.example.java.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User heejun = new User();
        heejun.name = "이희준";
        heejun.phoneNumber = "010-1234-5678";
        heejun.age = 26;

        User jaesung = new User();
        jaesung.name = "재성 매니저님";
        jaesung.phoneNumber = "010-8765-4321";
        jaesung.age = 24;

        System.out.printf("%s은 성인인가?: %b\n", heejun.name, heejun.isAdult());
        System.out.printf("%s은 성인인가?: %b\n", jaesung.name, jaesung.isAdult());
    }
}
