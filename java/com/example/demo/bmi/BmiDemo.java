package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName        : BmiDemo
 * author          : codejihyekim
 * date            : 2022-01-25
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        codejihyekim      최초 생성
 */
public class BmiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();
        System.out.println(BmiApp.WEBSITE);
        System.out.println("name: ");
        String name = scanner.next();
        System.out.println("height: ");
        double height = scanner.nextDouble();
        System.out.println("weight: ");
        double weight = scanner.nextDouble();
        String result = bmiApp.bmi(name, height, weight);
        System.out.println(result);
    }
}
