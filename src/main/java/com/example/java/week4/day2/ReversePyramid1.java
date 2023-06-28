package com.example.java.week4.day2;

public class ReversePyramid1 {
    private String spaceChar = "0";

    public ReversePyramid1(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(2 * (height - i) - 1));
    }

    public static void main(String[] args) {
        ReversePyramid1 rp1 = new ReversePyramid1(" ");
        int height = 4;

        for (int i = 0; i < height; i++) {
            System.out.print(rp1.makeALine(height, i));
        }
    }
}
