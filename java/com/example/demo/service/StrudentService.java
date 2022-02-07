package com.example.demo.service;

import com.example.demo.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName        : StrudentService
 * author          : codejihyekim
 * date            : 2022-02-07
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07        codejihyekim      최초 생성
 */
public interface StrudentService {
    String getBmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String google(GoogleDTO google);
    String getGrade(GradeDTO grade);
    String login(LoginDTO login);
}
