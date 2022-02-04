package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;
import org.springframework.util.FastByteArrayOutputStream;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : TemController
 * author          : codejihyekim
 * date            : 2022-02-03
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03        codejihyekim      최초 생성
 */
public class TemController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q1. 팀별 과제를 출력하세요.");

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        String[] arr = {"김지혜","최은아","심민혜","하진희","권솔이",
                        "bfs","stack","hash","greedy","heap",
                        "dfs","graph","dp","binsearch","bruteforce",
                        "sort","queue"};

        String s ="";
        for(int i = 0; i < arr.length; i++) {
            if(i % 5 == 0) {s += "\n";}
            s += i + ":" + arr[i] + "\t";

            /*
            if (i % 5 == 0){
                s += i + ":" + arr[i] + "\t";
            }else if(i % 5 == 1) {
                s += i + ":" + arr[i] + "\t";
            }else if(i % 5 == 2) {
                s += i + ":" + arr[i] + "\t";
            }else if(i % 5 == 3) {
                s += i + ":" + arr[i] + "\t";
            }else if(i % 5 == 4) {
                s += i + ":" + arr[i] + "\n";
            }
            */

            /*
            if(i == 5) {s += "\n";}
            if(i == 10) {s += "\n";}
            if(i == 15) {s += "\n";}
            s += i + ":" + arr[i] + "\t";
            */

        }
        System.out.println(s);
        s = "";
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요 예) 김진영, 힙, 그래프");
        String name = "김지혜";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
               for (int j = 0; j < 4; j++) {
                   s += arr[i+j*5] +", ";
                   if(i == 17) {break;}
               }
            }
        }
        System.out.println(s);
        s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 000");
        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals("queue")) {
                s += arr[i]+"를 담당한 사람: "+arr[i%5];
            }
        }
        System.out.println(s);
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 예) 권혜민(3개), 조현국(3개)");
        String countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int[] intArr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < 6; j++) {}
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


        s = "";
        System.out.println("Q5. 입력한 과목의 인덱스를 출력하세요");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("queue")) {
                s += i;
            }
        }
        System.out.println(s);
    }
}


