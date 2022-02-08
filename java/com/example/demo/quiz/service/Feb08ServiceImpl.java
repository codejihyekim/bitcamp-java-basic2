package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName        : Feb08ServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        codejihyekim      최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void roto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void reservation(Scanner scanner) {
        System.out.println("좌석예약시스템");
        final int size = 10;//좌석 10자리
        int[] seats = new int[size];

        while (true) {
            System.out.println("-----------------");
            for (int i = 0; i < size; i++) {
                System.out.print((i+1)+" ");//극장좌석번호 출력
            }
            System.out.println("\n-----------------");
            for (int i =0; i < size; i++) {
                System.out.print(seats[i]+" ");
            }
            System.out.println("\n-----------------");
            System.out.println("원하시는 좌석번호 입력(종료 -1): ");
            int s = scanner.nextInt();

            if (s == -1) {
                break;
            } else if (seats[s-1]==0){  //예약이 안된 경우 0으로 표기
                seats[s-1] = 1;         //예약된 좌석은 1로 바뀜
                System.out.println("예약되었습니다.");
            } else { //예약이 된 경우
                System.out.println("이미 예약 된 자리입니다.");
            }
        }
    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void multi(Scanner scanner) {

    }
}
