package com.example.demo.hello;
/**
 * packageName: com.example.demo.calc
 * fileName        : HelloApp.java
 * author          : codejihyekim
 * date            : 2022-01-24
 * desc            : id, pw, name을 받아서 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24        codejihyekim      최초 생성
 */
public class HelloApp {
    static String webSite = "Naver";
    String id;
    String pw;
    String name;

    public String hello(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        return String.format("ID: %s PW: %s Name: %s",this.id,this.pw,this.name);
    }
}
