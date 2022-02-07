package com.example.demo.controller;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;

import java.util.Scanner;

/**
 * packageName: com.example.demo.algorithm
 * fileName        : ArrayExam
 * author          : codejihyekim
 * date            : 2022-02-04
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-04        codejihyekim      최초 생성
 */
public class ArrayExam {

    public static void main(String[] args) {
        String[] arr = {"김지혜","최은아","심민혜","하진희","권솔이",
                "bfs","stack","hash","greedy","heap",
                "dfs","graph","dp","binsearch","bruteforce",
                "sort","queue"};

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("메뉴선택\n0.Exit 1.quiz1 2.quiz2 3.quiz3 4.quiz4 5.quiz5");
            String res = "";
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" : res = "1.quiz1";
                    quiz1(arr);break;
                case "2" : res = "2.quiz2";
                    quiz2(arr);break;
                case "3" : res = "3.quiz3";
                    quiz3(arr);break;
                case "4" : res = "4.quiz4";
                    quiz4(arr);break;
                case "5" : res = "5.quiz5";
                    quiz5(arr);break;
            }
        }
    }

    private static void quiz5(String[] arr) {
        String s = "";
        System.out.println("Q5. 입력한 과목의 인덱스를 출력하세요");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("queue")) {
                s += i;
            }
        }
        System.out.println(s);
    }

    private static void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 예) 권혜민(3개), 조현국(3개)");
        String countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int[] intArr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < intArr.length; j++) {

            }
            if (arr[i].equals(arr[5])){
                count0++;
            }
            if (arr[i].equals(arr[6])){
                count1++;
            }
            if (arr[i].equals(arr[7])){
                count2++;
            }
            if (arr[i].equals(arr[8])){
                count3++;
            }
            if (arr[i].equals(arr[9])){
                count4++;
            }
        }

        System.out.println(arr[0]+"의 카운트는 "+count0);
        System.out.println(arr[1]+"의 카운트는 "+count1);
        System.out.println(arr[2]+"의 카운트는 "+count2);
        System.out.println(arr[3]+"의 카운트는 "+count3);
        System.out.println(arr[4]+"의 카운트는 "+count4);
    }

    private static void quiz3(String[] arr) {
        String s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 000");
        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals("queue")) {
                s += arr[i]+"를 담당한 사람: "+ arr[i%5];
            }
        }
        System.out.println(s);
    }

    private static void quiz2(String[] arr) {
        String s = "";
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요 예) 김진영, 힙, 그래프");
        String name = "김지혜";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                for (int j = 0; j < 4; j++) {
                    s += arr[i+j*5] +", ";

                }
                if(i == 17) {break;}
            }
        }
        System.out.println(s);
    }

    private static void quiz1(String[] arr) {
        System.out.println("Q1. 팀별 과제를 출력하세요.");

        String s ="";

        for(int i = 0; i < arr.length; i++) {
            if(i % 5 == 0) {s += "\n";}
            s += i + ":" + arr[i] + "\t";
        }
        System.out.println(s);
    }
}
