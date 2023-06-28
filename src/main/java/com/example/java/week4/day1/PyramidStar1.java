package com.example.java.week4.day1;

public class PyramidStar1 {
    public static void main(String[] args) {
        int height = 4;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
