package com.example.java.week3.day2;

public class WhileFactorial {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;
        while (n > 0) {
            result *= n--;
        }
        System.out.println(result);
    }
}
