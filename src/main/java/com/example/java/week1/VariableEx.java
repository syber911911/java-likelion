package com.example.java.week1;

import com.example.java.week1.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal; // 선언
        iVal = 0; // 초기화

        PrintHello printHello; // 선언
        printHello = new PrintHello(); // 인스턴스화 & 초기화

        // 선언을 한다는 것은 메모리 공간을 확보하는 것이고, 초기화 한다는 것은 실제로 확보된 공간에 값을 할당한다는 의미.

        System.out.println(iVal);
        printHello.print();

    }
}
