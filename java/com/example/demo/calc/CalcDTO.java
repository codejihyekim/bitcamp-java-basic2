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
public class CalcDTO {
    public static String CALC_CAl = "Calc.com";
    private int num1;
    private int num2;
    private String opcode;

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public String getOpcode() {
        return opcode;
    }
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }



}
