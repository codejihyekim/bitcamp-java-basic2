package com.example.demo.quiz.service;

import com.example.demo.quiz.service.Feb07Service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName        : Feb07ServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-07
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07        codejihyekim      최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void dice(Scanner scanner) {

        System.out.println("첫번째 주사위");
        int a = scanner.nextInt();
        System.out.println("두번째 주사위");
        int b = scanner.nextInt();
        System.out.println("세번째 주사위");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000 + "원");
        } else if (a == b || a == c) {
            System.out.println(1000 + a * 100 + "원");
        } else if (b == c) {
            System.out.println(1000 + b * 100 + "원");
        } else {
            System.out.println(Math.max(Math.max(a, b), c) * 100 + "원");
        }
    }


    @Override
    public void rps(Scanner scanner) {
        Random random = new Random();
        int com = random.nextInt(3) + 1;
        int user = scanner.nextInt();
        int score = user - com;
        String[] str = {"", "주먹", "가위", "보"};
        String res = "";

        if (user > 3) {
            System.out.println("1~3까지의 숫자를 입력해주세요.");
            return;
        } else {
            if (score == 0) {
                res = "무승부입니다.";
            } else if (score == -1 || score == 2) {
                res = "이겼습니다.";
            } else {
                res = "졌습니다.";
            }
        }
        System.out.println("컴퓨터:" + str[com] + " 유저:" + str[user] + "\n" + res);
    }

    @Override
    public void getPrime(int num1, int num2) {
        System.out.println("# 방법 1.");
        String s = "";
        for (int i = num1; i <= num2; i++) {
            boolean flag = true;
            if (i == 1) {
                flag = false;
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                s += i + " ";
            }
        }
        System.out.println(s);
    }

    @Override
    public void leapYear(Scanner scanner) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("연도를 입력하시오 : ");
        int year = scanner1.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " 년은 윤년입니다.");
        } else {
            System.out.println(year + " 년은 평년입니다.");
        }
    }

    @Override
    public void numberGolf(Scanner scanner) {
        System.out.println("숫자 맞추기");
        int answer = (int) (Math.random() * 100) + 1;
        int count = 0;

        while (true) {
            count++;

            System.out.println("1과 100 사이의 값을 입력하세요: ");
            int input = scanner.nextInt();

            if (input == answer) {
                System.out.println("정답입니다." + count + "번째 만에 맞히셨습니다.");
                break;
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}