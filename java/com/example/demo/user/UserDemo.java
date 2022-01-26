package com.example.demo.user;

import java.util.Scanner;

/**
 * packageName: com.example.demo.user
 * fileName        : UserDemo
 * author          : codejihyekim
 * date            : 2022-01-26
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26        codejihyekim      최초 생성
 */
public class UserDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserApp userApp = new UserApp();
        String res = userApp.getuser();
        System.out.println(res);
    }
}