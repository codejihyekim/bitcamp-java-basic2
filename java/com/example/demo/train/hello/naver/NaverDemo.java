package com.example.demo.train.hello.naver;

import java.util.Scanner;

/**
 * packageName: com.example.demo.naver
 * fileName        : NaverDemo
 * author          : codejihyekim
 * date            : 2022-01-25
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        codejihyekim      최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();
        System.out.println(NaverApp.WEBSITE);
        System.out.println(" 아이디 ");
        String id = scanner.next();
        System.out.println(" 비밀번호 ");
        String pw = scanner.next();
        String result = naverApp.naver(id,pw);
        System.out.println(result);
    }
}
