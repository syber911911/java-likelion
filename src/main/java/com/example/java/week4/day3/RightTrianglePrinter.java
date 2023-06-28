package com.example.java.week4.day3;

import java.io.IOException;

public class RightTrianglePrinter {
    // System.out. ---> console
    // BufferedWriter ---> console, file
    private Printer printer;
    public RightTrianglePrinter(Printer printer) {
        this.printer = printer;
    }

    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i + 1));
    }

    public void printShape(int h) throws IOException {
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i);
        }
        printer.print(lines);
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtp = new RightTrianglePrinter(new FilePrinter());
        rtp.printShape(5);
    }
}
