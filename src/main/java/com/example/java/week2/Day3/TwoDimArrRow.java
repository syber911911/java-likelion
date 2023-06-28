package com.example.java.week2.Day3;

import java.util.Arrays;

public class TwoDimArrRow {
    public static void fillRow(int row, int[][] arr){
        arr[row][0] = 1;
        arr[row][1] = 1;
        arr[row][2] = 1;
        arr[row][3] = 1;
        arr[row][4] = 1;
        printTowDimArr(arr);
    }

    public static void printTowDimArr(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[2][0]  = 1;
        arr[2][1]  = 1;
        arr[2][2]  = 1;
        arr[2][3]  = 1;
        arr[2][4]  = 1;

        printTowDimArr(arr);

        int[][] arrTest = new int[5][5];
        fillRow(2, arrTest);
        fillRow(3, arrTest);

    }
}
