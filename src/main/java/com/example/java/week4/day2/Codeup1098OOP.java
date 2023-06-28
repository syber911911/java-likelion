package com.example.java.week4.day2;

import java.util.Scanner;

public class Codeup1098OOP {
    private int[][] board;

    public Codeup1098OOP() {
        this.board = null;
    }

    public Codeup1098OOP(int rowIndex, int columnIndex) {
        this.board = new int[rowIndex][columnIndex];
    }

    public void setBar(int l, int d, int x, int y) {
        for (int i = 0; i < l; i++) {
            if (d == 0) board[x - 1][y + i - 1] = 1;
            else board[x + i - 1][y - 1] = 1;
        }
    }

    public void readNSetBar() {
        Scanner sc = new Scanner(System.in);
        this.board = new int[sc.nextInt()][sc.nextInt()];
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            setBar(l, d, x, y);
        }
    }

    public void printBoard() {
        for (int[] row : board) {
            for (int column : row) {
                System.out.printf("%d ", column);
            }
            System.out.printf("\n");
        }
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Codeup1098OOP codeup = new Codeup1098OOP();
        codeup.readNSetBar();
        codeup.printBoard();
    }
}
