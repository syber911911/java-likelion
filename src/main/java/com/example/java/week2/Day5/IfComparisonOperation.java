package com.example.java.week2.Day5;

public class IfComparisonOperation {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age >= 18;

        if(isAdult){
            System.out.println("성인입니다.");
        }

        if(!isAdult){
            System.out.println("미성년자입니다.");
        }

        if(age < 18){
            System.out.println("미성년자입니다.");
        }
    }
}
