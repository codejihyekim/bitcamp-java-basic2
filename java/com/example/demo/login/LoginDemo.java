package com.example.demo.login;
/**
 * packageName: com.example.demo.calc
 * fileName        : LoginDemo
 * author          : codejihyekim.java
 * date            : 2022-01-24
 * desc            : Login을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24        codejihyekim      최초 생성
 */
import java.util.Scanner;

public class LoginDemo {
    public String execute(String id, String pw,String name) {
        LoginApp loginApp = new LoginApp();
        return loginApp.login(id, pw, name);
    }
}
