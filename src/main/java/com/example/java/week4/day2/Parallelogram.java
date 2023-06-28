package com.example.java.week4.day2;

public class Parallelogram {
    private String spaceChar = "0";

    public Parallelogram(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(height));
    }

    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(" ");
        int height = 4;

        for (int i = 0; i < height; i++) {
            System.out.print(parallelogram.makeALine(height, i));
        }
    }
}
