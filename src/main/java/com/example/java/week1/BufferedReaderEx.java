package com.example.java.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("line = " + br.readLine());
        System.out.println("line = " + br.readLine());
    }

    public void plusTwoNumbers() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println(br.readLine() + br.readLine()); // readLine의 return type은 String --> String 연산이 진행
        System.out.println(br.read() + br.read());
        // read는 입력 문자열 중 하나의 문자만을 읽어 ascii code 값으로 반환,
        // 100을 입력하면 buffer에 100이 담기고 200을 입력하기 전에 1, 0이 read 연산을 통해 계산되어 97 출력
    }
}