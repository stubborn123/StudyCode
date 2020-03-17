package com.zp.geek.algo.sort_11;


import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 插入排序
 * 这个插入排序，你可以看作是先拿一个最为一个有序数组
 * 然后每插入一个先按顺序找到自己的位置，保证这个数组是一个有序数组
 * 直到有序数组完全囊括整个排序数组
 */
public class InsertionSort {

    private static int[] getSortNums(){
        Random random = new Random();
        int[] nums = null;
        nums = random.ints(10,0,100).toArray();
        return nums;
    }

    //这个只是和插入的原理是一样的，但是他并不是原地的，因为他实际还创建初始化一个和排序数组一样大的空间来存放排好的数组
    private static void insertionSort(int[] nums){
        int[] sortNums = new int[nums.length];

        for(int i = 0; i < nums.length ;i++){

           sortNums[i] = nums[i];
           singleInsertionSort(sortNums);

        }
    }

    private static void singleInsertionSort(int[] sortNums){

        for( int i = sortNums.length ; i < 0 ; i-- ){
            if( sortNums[i]  < sortNums[i - 1 ] ){
                int temp = sortNums[i-1];
                sortNums[i - 1] = sortNums[i];
                sortNums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(sortNums));
    };

    public static void main(String[] args) {
        int[] sortNums = getSortNums();
        System.out.println(Arrays.toString(sortNums));

        insertionSort(sortNums);

    }
}
