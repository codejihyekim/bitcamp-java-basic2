package com.example.demo.student.controller;

import com.example.demo.student.domain.BmiDTO;
import com.example.demo.student.domain.CalcDTO;
import com.example.demo.student.domain.GoogleDTO;
import com.example.demo.student.domain.GradeDTO;
import com.example.demo.student.domain.LoginDTO;
import com.example.demo.student.service.StrudentService;
import com.example.demo.student.service.StrudentServiceImpl;

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
public class StudentController {
    public void excute(Scanner scanner) {
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login =new LoginDTO();
        StrudentService service = new StrudentServiceImpl();

        while(true){
            System.out.println("메뉴 선택\n0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN");
            String res = "";

            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit");return;
                case "1" : res = "BMI";
                    System.out.println(BmiDTO.WEBSITE+"\n이름, 키, 몸무게 입력");
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextDouble());
                    bmi.setWeight(scanner.nextDouble());
                    res = service.getBmi(bmi);
                break;
                case "2" : res = "CALC";
                    System.out.println(CalcDTO.CALC_CAl+"\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.calc(calc);
                break;
                case "3" : res = "GOOGLE";
                    System.out.println(GoogleDTO.WESITE +"\n검색 입력");
                    google.setSearch(scanner.next());
                    res = service.google(google);
                break;
                case "4" : res = "GRADE";
                    System.out.println(GradeDTO.GRADE_TITLE+"\n이름, 국어, 영어, 수학");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = service.getGrade(grade);
                break;
                case "5" : res = "LOGIN";
                    System.out.println(LoginDTO.LOGIN_TITLE +"\n아이디, 비번, 이름");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = service.login(login);
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
