package com.example.demo.hello;
/**
 * packageName: com.example.demo.calc
 * fileName        : HelloDemo.java
 * author          : codejihyekim
 * date            : 2022-01-24
 * desc            : hello 앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24        codejihyekim      최초 생성
 */
import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloApp helloApp = new HelloApp();
        System.out.println(HelloApp.webSite);
        System.out.println("ID: ");
        String id = scanner.next();
        System.out.println("PW: ");
        String pw = scanner.next();
        System.out.println("Name: ");
        String name = scanner.next();
        String result = helloApp.hello(id, pw, name);
        System.out.println(result);
    }
}
