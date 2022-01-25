package com.example.demo.google;

/**
 * packageName: com.example.demo.google
 * fileName        : GoogleApp.java
 * author          : codejihyekim
 * date            : 2022-01-25
 * desc            : search 값을 받아서 리턴하는 앱
 * variable        :
 * [클래스변수]  WESITE
 * [인스턴스변수]  search
 * [파라미터] search
 * [로컬변수] result
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        codejihyekim      최초 생성
 */
public class GoogleApp {
    public static String WESITE = "Google";
    private String search;

    public String google(String search) {
        this.search = search;
        String result = String.format("%s 을 검색한 결과입니다.",this.search);
        return result;
    }
}
