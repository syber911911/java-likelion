package com.example.java.week4.day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static String getRepeatedSymbolFor(String symbol, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += symbol;
        }
        return answer;
    }

    public static String makeALine(int height, int i) {
        int pivot = height / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (height - i) - 1));
        }
    }

    public static void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public static void writeOnFile(int height) throws IOException {
        File file = new File("/Users/hjun/Desktop/diamond.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < height; i++) {
            fw.write(makeALine(height, i));
        }
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        int height = 7;
        writeOnFile(height);
        printShape(height);
    }
}
