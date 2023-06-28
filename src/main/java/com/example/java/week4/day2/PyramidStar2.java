package com.example.java.week4.day2;

public class PyramidStar2 {
    String spaceChar;

    public PyramidStar2(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    public static void main(String[] args) {
        PyramidStar2 pyramid1 = new PyramidStar2(" ");
        PyramidStar2 pyramid2 = new PyramidStar2("%");
        int height = 4;
        pyramid1.printPyramid(height);
        pyramid2.printPyramid(height);
    }
}
