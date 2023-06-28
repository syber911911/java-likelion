package com.example.java.week2.Day1;

public class FloatPlus {
    public static void main(String[] args) {
        String val1 = "1.1111111";
        String val2 = "2.11111111";
        float dVal1 = Float.parseFloat(val1);
        System.out.println("dVal1 = " + dVal1);
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        double result2 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }
}
