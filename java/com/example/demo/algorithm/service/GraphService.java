package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName        : GraphService
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        codejihyekim      최초 생성
 */
public interface GraphService {
    int far(int n, int[][] edge);
    int ranking(int n, int[][] results);
    int room(int[] arrows);
}
