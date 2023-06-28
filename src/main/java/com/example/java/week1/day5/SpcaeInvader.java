package com.example.java.week1.day5;

public class SpcaeInvader {
    private void moveLeft() {
        int location = 0;
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }

    private void moveRight() {
        int location = 0;
        location = location + 1;
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpcaeInvader spcaeInvader = new SpcaeInvader();
        spcaeInvader.moveLeft();
        spcaeInvader.moveRight();
    }
}
