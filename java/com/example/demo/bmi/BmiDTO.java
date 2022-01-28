package com.example.demo.bmi;

/**
 * packageName: com.example.demo.bmi
 * fileName        : BmiApp
 * author          : codejihyekim
 * date            : 2022-01-25
 * desc            :
 * 클래스 변수       : WEBSITE
 * 인스턴스 변수     : name, height, weight
 * 파라미터         : name, height, weight
 * 로컬            : result
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        codejihyekim      최초 생성
 */
public class BmiDTO {
    public static String WEBSITE = "BMI";
    private static String name;
    private static double height;
    private static double weight;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}



