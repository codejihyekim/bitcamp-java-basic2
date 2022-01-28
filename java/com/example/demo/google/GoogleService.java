package com.example.demo.google;

/**
 * packageName: com.example.demo.google
 * fileName        : GoogleDemo
 * author          : codejihyekim
 * date            : 2022-01-25
 * desc            : Google 앱을 실행하는 컨트롤러
 *
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        codejihyekim      최초 생성
 */
public class GoogleService {
    public String getGoogle(GoogleDTO google) {

        return String.format("%s 을 검색한 결과입니다.",google.getSearch());
    }

}
