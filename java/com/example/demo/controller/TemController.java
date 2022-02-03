package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

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
        String[] twoNames = {"김지혜","최은아","심민희","하진희","권솔이"};
        String[] twoSubjects = {"bfs","stack","hash","greedy","heap",
                                "dfs","graph","dp","binsearch","bruteforce",
                                "sort","queue"," "," "," "};

        for(int i = 0; i < twoNames.length; i++) {
                System.out.println(twoNames[i] +": "+twoSubjects[i]+", "+twoSubjects[i+5]+", "+twoSubjects[i+10]);
        }
    }
}
