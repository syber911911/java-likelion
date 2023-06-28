package com.example.java.week1.day5;

import com.example.java.week1.PrintHello;

public class ConstantEx {
    public final int MAX_LEVEL = 3;
    public static final int MIN_LEVEL = 1;
    public static void main(String[] args) {
        ConstantEx constantEx = new ConstantEx();
        final int iVal;
        iVal = 1;
        System.out.println(iVal);
        System.out.println(constantEx.MAX_LEVEL);
        System.out.println(MIN_LEVEL);

        final PrintHello printHello = new PrintHello();
    }
}
