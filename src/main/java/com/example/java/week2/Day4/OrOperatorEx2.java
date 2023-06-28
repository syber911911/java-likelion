package com.example.java.week2.Day4;

public class OrOperatorEx2 {
    public static void main(String[] args) {
        int yearsOfExp = 8;
        int numOfProj = 12;

        boolean isPromotion = yearsOfExp > 5 || numOfProj > 10;
        System.out.printf("팀장 승진 여부: %b\n", isPromotion);
    }
}
