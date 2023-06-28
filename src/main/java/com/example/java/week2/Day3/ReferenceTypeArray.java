package com.example.java.week2.Day3;

import java.util.Arrays;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student student = new Student();
        Student[] students = new Student[2];

        students[0] = new Student();
        students[0].name = "이희준";
        students[0].phoneNumber = "010-1111-2222";
        students[0].age = 26;

        /*
        //Cannot assign field "name" because "students[1]" is null
        students[1].name = "LEEHEEJUN";
        students[1].phoneNumber = "010-2222-1111";
        students[1].age = 26;
        */

        System.out.println(Arrays.toString(students));
        System.out.println(students[0].name);
    }
}
