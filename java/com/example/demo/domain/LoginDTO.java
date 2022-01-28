package com.example.demo.domain;

import java.sql.PreparedStatement;

/**
 * packageName: com.example.demo.calc
 * fileName        : LoginApp.java
 * author          : codejihyekim
 * date            : 2022-01-24
 * desc            : id, pw, name 받아서 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24        codejihyekim      최초 생성
 */
public class LoginDTO {
    public static String LOGIN_TITLE = "로그인";
    String id;
    String pw;
    String name;
    public static String PASSWORD = "abc";

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}