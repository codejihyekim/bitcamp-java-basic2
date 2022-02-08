package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName        : GreedyService
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        codejihyekim      최초 생성
 */
public interface GreedyService {
    int uniform(int n, int[] lost, int[] reserve);
    int joyStick(String name);
    String bigNumber(String number, int k);
    int boat(int[] people, int limit);
    int island(int n, int[][] costs);
    int camera(int[][] routes);
}
