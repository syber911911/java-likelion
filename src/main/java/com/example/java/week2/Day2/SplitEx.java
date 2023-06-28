package com.example.java.week2.Day2;

public class SplitEx {
    public static void main(String[] args) {
        String str = "10 3 19 28 7 488";
        String[] strArr = str.split("\\s");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(strArr[4]);
        System.out.println(strArr[5]);

    }
}
