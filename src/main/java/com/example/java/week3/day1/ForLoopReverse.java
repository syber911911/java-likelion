package com.example.java.week3.day1;

public class ForLoopReverse {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--) {
            //System.out.println(i);
            System.out.printf("%d ", i);
        }
        System.out.printf("\n");
        for(int i = 10; i >= 0; i--) {
            System.out.printf("%d ", i);
        }
    }
}
