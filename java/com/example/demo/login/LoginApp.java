package com.example.demo.login;
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
public class LoginApp {
    static String LOGIN_TITLE = "로그인";
    String id;
    String pw;
    String name;
    static String PASSWORD = "abc";


    public String login(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        /*
        if(pw.equals(PASSWORD)) {
            result = String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", this.name, this.pw);
        } else {
            result = String.format(" %s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ",this.id,this.pw);
        }*/
        /* switch (pw) {
            case "abc" : result = String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", this.name, this.pw); break;
            default :  result = String.format(" %s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ",this.id,this.pw);break;
        }*/
        return  (pw.equals(PASSWORD)) ? String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", this.name, this.pw)
                : String.format(" %s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ",this.id,this.pw);
    }
}