package com.example.java.week4.day1;

import java.util.Random;
import java.util.Scanner;
// 배열을 통한 접근법도 생각해보기
public class RockPaperScissors {
    public String play(int user, int computer) {
        int flag = user - computer;

        switch (flag) {
            case 0:
                return "tie";
            case -1, 2:
                return "win";
            case 1, -2:
                return "lose";
            default:
                return "Error";
        }
    }

    public int randomNumber(int start, int end) {
        Random ran = new Random();
        return ran.nextInt(end - start + 1);
    }

    public String getRockPaperScissors(int num) {
        switch (num) {
            case 0: return "바위";
            case 1: return "가위";
            case 2: return "보";
            default: return "Error";
        }
    }

    public int getRockPaperScissorsNum(String str) {
        return switch (str) {
            case "바위" -> 0;
            case "가위" -> 1;
            case "보" -> 2;
            default -> throw new IllegalArgumentException("잘못 입력했습니다.");
        };
    }

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        Scanner sc = new Scanner(System.in);
        String userInput;
        int user;
        int computer;
        do {
            System.out.print("바위, 가위, 보 중 하나를 입력하세요: ");
            userInput = sc.next();
            user = rps.getRockPaperScissorsNum(userInput);
            computer = rps.randomNumber(0, 2);
            System.out.printf("User: %s, Computer: %s, You %s!!\n", userInput, rps.getRockPaperScissors(computer), rps.play(user, computer));
        } while (!rps.play(user, computer).equals("win"));
    }
}
