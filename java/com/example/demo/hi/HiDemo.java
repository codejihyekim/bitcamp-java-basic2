package com.example.demo.hi;

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
