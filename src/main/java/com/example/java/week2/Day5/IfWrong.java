package com.example.java.week2.Day5;

public class IfWrong {
    public static void main(String[] args) {
        int score = 81;

        if (score >= 90) { // false
            System.out.println("A");
        }
        if (score >= 80) { // false
            System.out.println("B");
        }
        if (score >= 70) { // true
            System.out.println("C");
        }
    }
}
