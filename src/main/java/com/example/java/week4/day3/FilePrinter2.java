package com.example.java.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter2 implements Printer2{
    @Override
    public void print(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/hjun/Desktop/test.txt"));
        bw.append(message);
        bw.flush();
        bw.close();
    }
}
