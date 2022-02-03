package com.example.demo.train.hello.hi;
/**
 * packageName: com.example.demo.calc
 * fileName        : HiDemo.java
 * author          : codejihyekim
 * date            : 2022-01-24
 * desc            : hi앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24        codejihyekim      최초 생성
 */
import java.util.Scanner;

public class HiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HiApp hiApp = new HiApp();
        System.out.println(HiApp.webSite);
        System.out.println("name: ");
        String name = scanner.next();
        System.out.println("age: ");
        int age = scanner.nextInt();
        String result = hiApp.hi(name, age);
        System.out.println(result);
    }
}
