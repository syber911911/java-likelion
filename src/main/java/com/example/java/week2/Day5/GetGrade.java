package com.example.java.week2.Day5;

public class GetGrade {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90) { // false
            System.out.println("A");
        } else if (score >= 80) { // false
            System.out.println("B");
        } else if (score >= 70) { // true
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        int score2 = 95;

        if (score2 >= 70) { // false
            System.out.println("C");
        } else if (score2 >= 80) { // false
            System.out.println("B");
        } else if (score2 >= 90) { // true
            System.out.println("A");
        } else {
            System.out.println("F");
        }
    }
}
