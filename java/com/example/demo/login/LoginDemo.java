package com.example.demo.login;
/**
 * packageName: com.example.demo.calc
 * fileName        : LoginDemo
 * author          : codejihyekim.java
 * date            : 2022-01-24
 * desc            : Login을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24        codejihyekim      최초 생성
 */
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.webSite);
        System.out.println("ID: ");
        String id = scanner.next();
        System.out.println("PW: " );
        String pw = scanner.next();
        System.out.println("Name: ");
        String name = scanner.next();
        String result = loginApp.login(id, pw, name);
        System.out.println(result);
    }
}
