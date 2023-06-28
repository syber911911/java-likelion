package com.example.java.week3.day1;

public class MultiplicationTable3 {
    public static void printDan(int dan) {
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println("-----------------");
        }
        printDan(7);
    }
}
