package com.example.java.week2.Day1;

public class FloatDigit {
    public static void main(String[] args) {
        float f5 = 1.23e5f;
        float f6 = 1.23e6f;
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;


        System.out.printf("f5: %f\n", f5);
        System.out.printf("f6: %f\n", f6);
        System.out.printf("f7: %f\n", f7);
        System.out.printf("f8: %f\n", f8);
        System.out.printf("f9: %f\n", f9);
        System.out.printf("f10: %f\n", f10);

        float f1 = 3.141592653589793f;
        System.out.println(f1);
        System.out.println("1" + 1);

        String val1 = "1.5";
        String val2 = "2.5";

        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("result = " + result);
    }
}
