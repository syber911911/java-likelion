package com.example.java.week3.day2;

public class Digits {
    public static void main(String[] args) {
        int num = 45634;
        int digits = 0;

        while (num != 0) {
            num /= 10;
            digits++;
        }
        System.out.println(digits);
    }
}
