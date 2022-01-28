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

public class CalcService {
    public String getCalc(CalcDTO calc) {
        int result = 0;

        /*
        if(calc.getOpcode().equals("+")){
            result = calc.getNum1() + calc.getNum2();
        } else if(calc.getOpcode().equals("-")){
            result = calc.getNum1() - calc.getNum2();
        } else if(calc.getOpcode().equals("*")){
            result = calc.getNum1() * calc.getNum2();
        } else if(calc.getOpcode().equals("/")){
            result = calc.getNum1() / calc.getNum2();
        }
        */

        switch (calc.getOpcode()){
            case "+" : result = calc.getNum1() + calc.getNum2(); break;
            case "-" : result = calc.getNum1() - calc.getNum2(); break;
            case "*" : result = calc.getNum1() * calc.getNum2(); break;
            case "/" : result = calc.getNum1() / calc.getNum2(); break;
        }

        return String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(),result);
    }

}
