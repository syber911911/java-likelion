package com.example.java.week2.Day4;

public class Accumulate687Compund {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        answer += num % 10;
        num /= 10;
        answer += num % 10;
        num /= 10;
        answer += num % 10;
        num /= 10;
        System.out.println(answer);
    }
}
