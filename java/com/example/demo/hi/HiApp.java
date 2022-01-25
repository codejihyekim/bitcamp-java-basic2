package com.example.demo.hi;

public class HiApp {
    static String webSite = "HiApp";
    String name;
    int age;

    public String hi(String name, int age) {
        this.name = name;
        this.age = age;
        return String.format("안녕 내 이름은 %s 이고 %d 살이야",this.name,this.age);
    }
}
