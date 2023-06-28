package com.example.java.week2.Day5;

import java.util.Scanner;

public class PromotionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연차를 입력하세요 > ");
        int years = sc.nextInt();
        System.out.print("프로젝트 횟수를 입력하세요 > ");
        int projectCnt = sc.nextInt();

        if (years > 5 || projectCnt > 10) {
            System.out.println("팀장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
}
