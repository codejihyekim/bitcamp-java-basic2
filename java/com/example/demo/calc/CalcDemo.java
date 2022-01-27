package com.example.demo.calc;
/**
 * packageName: com.example.demo.calc
 * fileName        : CalcDemo.java
 * author          : codejihyekim
 * date            : 2022-01-24
 * desc            : 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24        codejihyekim      최초 생성
 */
import java.util.Scanner;

public class CalcDemo {
    public String execute(int num1,String opcode,int num2) {
        CalcApp calcApp = new CalcApp();
        return calcApp.getCalc(num1, opcode, num2);
    }
}
