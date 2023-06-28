package com.example.java.week2.Day2;

public class AccountMessage {
    public static void main(String[] args) {
        String name = "이희준";
        int balance = 2_000_0000;
        String message = name + "님의 통장 잔고는 " + balance + "원 입니다.";
        String result = String.format("%s님의 통장 잔고는 %d원 입니다.", name, balance);
        System.out.println(message);
        System.out.println(result);
    }
}
