package com.example.demo.hello;

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
