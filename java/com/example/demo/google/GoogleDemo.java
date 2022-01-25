package com.example.demo.google;

import java.util.Scanner;

/**
 * packageName: com.example.demo.google
 * fileName        : GoogleDemo
 * author          : codejihyekim
 * date            : 2022-01-25
 * desc            : Google 앱을 실행하는 컨트롤러
 *
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        codejihyekim      최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp = new GoogleApp();
        System.out.println(GoogleApp.WESITE);
        System.out.println(" google 검색 또는 URL 검색 ");
        String search = scanner.next();
        String result = googleApp.google(search);
        System.out.println(result);
    }
}
