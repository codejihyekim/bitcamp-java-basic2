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

public class LoginService {
    public String getLogin(LoginDTO login) {
        /*
        String result = "";
        if(login.getPw().equals(login.PASSWORD)) {
            result = String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", login.getId(), login.getPw());
        } else {
            result = String.format(" %s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ",login.getId(),login.getPw());
        }
         return result;
        */
        /*
        String result = "";
        switch (login.getPw()) {
            case "abc" : result = String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", login.getName(), login.getPw()); break;
            default :  result = String.format(" %s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ",login.getId(),login.getPw());break;

        return result;
        */

        return (login.getPw().equals(login.PASSWORD)) ? String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", login.getName(), login.getPw())
             : String.format(" %s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ",login.getId(),login.getPw());
    }
}
