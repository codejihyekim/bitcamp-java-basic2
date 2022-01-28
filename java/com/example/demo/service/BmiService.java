package com.example.demo.service;

import com.example.demo.domain.BmiDTO;

/**
 * packageName: com.example.demo.bmi
 * fileName        : BmiDemo
 * author          : codejihyekim
 * date            : 2022-01-25
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        codejihyekim      최초 생성
 */
public class BmiService {
    public String getBmi(BmiDTO bmi) {

        return String.format("%s 의 BMI는 정상입니다.",bmi.getName());
    }
}
