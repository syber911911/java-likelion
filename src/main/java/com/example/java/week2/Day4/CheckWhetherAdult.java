package com.example.java.week2.Day4;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int userAge = 31;
        boolean isAdult = userAge >= 18;
        System.out.printf("미성년자입니가? > %b\n", !isAdult);
    }
}
