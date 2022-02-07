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

            System.out.println("첫번째 주사위");
            int a = scanner.nextInt();
            System.out.println("두번째 주사위");
            int b = scanner.nextInt();
            System.out.println("세번째 주사위");
            int c = scanner.nextInt();

            if (a==b&&b==c){
                System.out.println(10000+a*1000+"원");
            }else if (a==b||a==c){
                System.out.println(1000+a*100+"원");
            }else if(b == c){
                System.out.println(1000+b*100+"원");
            }else
                System.out.println(Math.max(Math.max(a,b),c)*100+"원");
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
