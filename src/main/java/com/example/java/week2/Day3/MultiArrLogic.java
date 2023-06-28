package com.example.java.week2.Day3;

public class MultiArrLogic {
    public static void main(String[] args) {
        int[][] values = new int[3][2];
        int[] arr = values[0];

        System.out.println("B 배열의 주소 : " + values);
        System.out.println("C1 배열의 주소 : " + values[0]);
        System.out.println("arr 배열의 주소(= C1) : " + arr);
        System.out.println("C1 배열의 0번 index : " + values[0][0]);
    }
}
