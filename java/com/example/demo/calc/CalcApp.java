package com.example.demo.calc;
/**
 * packageName: com.example.demo.calc
 * fileName        : CalcApp.java
 * author          : codejihyekim
 * date            : 2022-01-24
 * desc            : 숫자 2개와 연산자를 받아서 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24        codejihyekim      최초 생성
 */
public class CalcApp {
    static String webSite = "Calc.com";
    int num1;
    int num2;
    String opcode;

    public String calc(int num1, String opcode, int num2) {
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        int result = num1 + num2;
        return String.format("%d %s %d = %d",this.num1, this.opcode,this.num2,result);
    }
}
