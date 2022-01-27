package com.example.demo.controller;

import com.example.demo.bmi.BmiApp;
import com.example.demo.bmi.BmiDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.google.GoogleApp;
import com.example.demo.google.GoogleDemo;
import com.example.demo.grade.GradeApp;
import com.example.demo.grade.GradeDemo;
import com.example.demo.login.LoginApp;
import com.example.demo.login.LoginDemo;
import org.apache.coyote.http11.filters.IdentityOutputFilter;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName        : Demo
 * author          : codejihyekim
 * date            : 2022-01-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27        codejihyekim      최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDemo bmiDemo = new BmiDemo();
        CalcDemo calcDemo = new CalcDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        GradeDemo gradeDemo = new GradeDemo();
        LoginDemo loginDemo = new LoginDemo();

        while(true){
            System.out.println("메뉴 선택");
            String menu = "0.Exit\n 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";

            switch (select) {
                case "0" :
                    System.out.println("Exit");return;
                case "1" : res = "BMI";
                    System.out.println(BmiApp.WEBSITE+"\n이름, 키, 몸무게 입력");
                    System.out.println(bmiDemo.execute(scanner.next(),scanner.nextDouble() ,scanner.nextDouble()));
                break;
                case "2" : res = "CALC";
                    System.out.println(CalcApp.CALC_CAl+"\n숫자1, 연산자, 숫자2 입력");
                    System.out.println(calcDemo.execute(scanner.nextInt(),scanner.next() ,scanner.nextInt()));
                break;
                case "3" : res = "GOOGLE";
                    System.out.println(GoogleApp.WESITE +"\n검색 입력");
                    System.out.println(googleDemo.execute(scanner.next()));
                break;
                case "4" : res = "GRADE";
                    System.out.println(GradeApp.GRADE_TITLE+"\n이름, 국어, 영어, 수학");
                    System.out.println(gradeDemo.execute(scanner.next(),scanner.nextInt() ,scanner.nextInt(),scanner.nextInt()));
                break;
                case "5" : res = "LOGIN";
                    System.out.println(LoginApp.LOGIN_TITLE +"\n아이디, 비번, 이름");
                    System.out.println(loginDemo.execute(scanner.next(),scanner.next(),scanner.next()));
                break;
                default : res = " 1 ~ 5 으로 다시 입력해주세요";break;
            }
        /*
        if (select.equals("1")) {
            res = "BMI";
        } else if (select.equals("2")) {
            res = "CALC";
        } else if (select.equals("3")) {
            res = "SEARCH";
        } else if (select.equals("4")) {
            res = "GRADE";
        } else if (select.equals("5")) {
            res = "LOGIN";
        } else {
            res = " 1 ~ 5 으로 다시 입력해주세요";
        }*/
            System.out.println(res);
        }
    }
}
