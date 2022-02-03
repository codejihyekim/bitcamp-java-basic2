package com.example.demo.train.hello.hi;
/**
 * packageName: com.example.demo.calc
 * fileName        : HiApp.java
 * author          : codejihyekim
 * date            : 2022-01-24
 * desc            : 이름과 나이를 받아서 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24        codejihyekim      최초 생성
 */
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
