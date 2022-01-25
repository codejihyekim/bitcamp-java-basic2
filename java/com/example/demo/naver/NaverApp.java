package com.example.demo.naver;

/**
 * packageName: com.example.demo.naver
 * fileName        : NaverApp
 * author          : codejihyekim
 * date            : 2022-01-25
 * desc            :
 * 클래스 변수       : WEBSITE
 * 인스턴스 변수     : id , pw
 * 파라미터         : id , pw
 * 로컬            : result
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        codejihyekim      최초 생성
 */
public class NaverApp {
    public static String WEBSITE = "Naver";
    private static String id;
    private static String pw;

    public String naver(String id, String pw) {
        this.id = id;
        this.pw = pw;
        String result = String.format("아이디 %s 로그인 성공", this.id);
        return result;
    }
}
