package com.example.java.week4.day3;

import java.io.IOException;

public class HelloPrinter {
    Printer2 printer;

    public HelloPrinter(Printer2 printer) {
        this.printer = printer;
    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter2());
        HelloPrinter hp2 = new HelloPrinter(new FilePrinter2());
        hp.repeatMessage(5, "Hello");
        hp2.repeatMessage(5, "Bye");
    }

}
