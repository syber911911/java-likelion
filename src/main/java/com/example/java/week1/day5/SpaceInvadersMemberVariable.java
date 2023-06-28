package com.example.java.week1.day5;

public class SpaceInvadersMemberVariable {
    int location;
    public void moveLeft(){ //print를 method 내에서 수행 할 것이면 moveLeftAndPrint 이런식으로 명명하는게 더 괜찮다.
        location = location - 1;
        //System.out.printf("moveLeft: %d\n", location);
    }
    public void moveRight(){
        location = location + 1;
        //System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable spaceInvadersMemberVariable = new SpaceInvadersMemberVariable();
        spaceInvadersMemberVariable.moveRight();
        spaceInvadersMemberVariable.moveRight();
        spaceInvadersMemberVariable.moveRight();
        spaceInvadersMemberVariable.moveLeft();

        System.out.printf("최종 location: %d\n", spaceInvadersMemberVariable.location);
        spaceInvadersMemberVariable.moveRight();
        System.out.printf("최종 location: %d\n", spaceInvadersMemberVariable.location);
    }
}
