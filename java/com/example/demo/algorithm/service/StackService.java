package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName        : StackService
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        codejihyekim      최초 생성
 */
public interface StackService {
    int[] function(int[] progresses, int[] speeds);
    int print(int[] priorities, int location);
    int truck(int bridgeLength, int weight, int truckWeights);
    int[] stock(int[] prices);
}
