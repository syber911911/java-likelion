package com.example.java.week3.day1;

public class LoopAscii {
    public static void main(String[] args) {
        for(int c = 97; c <= 'z'; c++) {
            System.out.printf("%d:%c ", c, c);
        }
    }
}
