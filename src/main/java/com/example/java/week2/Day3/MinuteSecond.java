package com.example.java.week2.Day3;

public class MinuteSecond {
    public static void main(String[] args) {
        int seconds = 239; // 239초
        int minute = seconds / 60; //분으로 변환
        int remainSeconds = seconds % 60; //분으로 변환하고 남은 초
        System.out.printf("%d분 %d초", minute, remainSeconds);
    }
}
