package com.example.demo.login;

public class LoginApp {
    static String webSite = "로그인";
    String id;
    String pw;
    String name;

    public String login(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        return String.format("ID: %s PW: %s Name: %s", this.id, this.pw, this.name);
    }
}