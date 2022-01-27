package com.example.demo.algorithm;

import com.example.demo.bmi.BmiDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.grade.GradeDemo;
import com.example.demo.login.LoginDemo;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName        : DemoController2
 * author          : codejihyekim
 * date            : 2022-01-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27        codejihyekim      최초 생성
 */
public class DemoController2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.println("[menu] 0.Exit\n" +
                    "[김지혜] 1. sort \t" +
                    "2. graph \t"  +
                    "[최은아] 3. hash \n"  +
                    "4. stack \t"  +
                    "5. brute force \t" +
                    "6. dfs \t"  +
                    "7. bfs \n"  +
                    "8. dp \t"   +
                    "9.  heap \n" +
                    "10. bin search" +
                    "11. greedy" +
                    "12. queue");

            switch (scanner.next()) {
                case "0" : return;
                case "1" : break;
                default:
                    System.out.println("Wrong Number"); break;
            }
        }
    }
}
