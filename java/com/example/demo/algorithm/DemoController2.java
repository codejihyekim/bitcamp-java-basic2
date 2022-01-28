package com.example.demo.algorithm;

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
                    "2. graph \n"  +
                    "[최은아] 3. stack  \t"  +
                    "4. queue \t"  +
                    "5. dfs \t" +
                    "6. bfs \n"  +
                    "[권솔이] 7. heap \t"  +
                    "8. brute force \n"   +
                    "[심민혜] 9.hash \t" +
                    "10. dp \n" +
                    "[하진희] 11. greedy \t" +
                    "12. bin search \n");

            switch (scanner.next()) {
                case "0" : return;
                case "1" :
                    break;
                default:
                    System.out.println("Wrong Number"); break;
            }
        }
    }
}
