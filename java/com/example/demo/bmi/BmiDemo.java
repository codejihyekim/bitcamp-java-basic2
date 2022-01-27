package com.example.demo.bmi;

import java.util.Scanner;

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
public class BmiDemo {
    public String execute(String name,double height, double weight) {
        BmiApp bmiApp = new BmiApp();
        return bmiApp.getBmi(name, height, weight);
    }
}
