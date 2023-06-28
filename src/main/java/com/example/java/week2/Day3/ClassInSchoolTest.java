package com.example.java.week2.Day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "홍길동";
        classInSchool.teacher.age = 33;
        classInSchool.teacher.address = "지구 어딘가";
        classInSchool.students = new Student[30];

        System.out.printf("%d반 담임 선생님 성함은 %s입니다.", classInSchool.no, classInSchool.teacher.name);
    }
}
