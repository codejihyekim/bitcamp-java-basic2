package com.example.demo.service;

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
public class Feb07ServiceImpl implements Feb07Service{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void dice(Scanner scanner) {

    }

    @Override
    public void rps(Scanner scanner) {

    }

    @Override
    public void getPrime(Scanner scanner) {

    }

    @Override
    public void leapYear(Scanner scanner) {

    }

    @Override
    public String numberGolf() {
        System.out.println("숫자 맞추기");
        int answer = (int) (Math.random() * 100) + 1;
        int count = 0;

        String s = "";
        while (true) {
            count++;

            System.out.println("1과 100 사이의 값을 입력하세요: ");
            int input = scanner.nextInt();

            if (input == answer) {
                s = "정답입니다." + (count + 1) + "번째 만에 맞히셨습니다.";
                break;
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        return s;
    }
}
