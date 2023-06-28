package com.example.java.week2.Day2;

import java.util.Arrays;

public class DefAndInitArr {
    public static void main(String[] args) {
        int[] iArr = new int[5];
        int[] iArr2 = {1, 2, 3, 8}; //int[] iArr2 = new int[]{1, 2, 3, 8}

        iArr[0] = 2;
        iArr[1] = 4;
        iArr[2] = 7;
        System.out.println(iArr[0]);
        System.out.println(Arrays.toString(iArr));
        System.out.println(Arrays.toString(iArr2));
    }
}
