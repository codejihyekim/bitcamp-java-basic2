package com.example.demo.train.hello.member;

import java.util.Scanner;

/**
 * packageName: com.example.demo.member
 * fileName        : MemberDemo
 * author          : codejihyekim
 * date            : 2022-01-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27        codejihyekim      최초 생성
 */
public class MemberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberApp memberApp =  new MemberApp();
        String res = memberApp.getmember();
        System.out.println(res);
    }
}
