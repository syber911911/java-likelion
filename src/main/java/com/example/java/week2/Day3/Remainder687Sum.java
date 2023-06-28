package com.example.java.week2.Day3;

public class Remainder687Sum {
    public static void main(String[] args) {
        int val = 687;
        int hundred = val / 100;
        val = val % 100;
        int ten = val / 10;
        val = val % 10;
        int one = val;
        /*
        int one = val % 10;
        val = val / 10;
        int ten = val % 10;
        val = val / 10;
        int hundred = val % 10;
         */


        System.out.printf("백의 자리 %d, 십의 자리 %d, 일의 자리 %d\n", hundred, ten, one);
        System.out.printf("각 자리의 합 : %d", hundred + ten + one);
    }
}
