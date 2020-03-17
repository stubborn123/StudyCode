package com.zp.geek.algo.sort_11;

import java.util.Arrays;
import java.util.Random;

/**
 * 选择排序是最朴素的，就是不断找最小（大）的，
 * 将这个最小(大)挑出来放进
 */
public class SelectionSort {


    private static int[] getSortNums(){
        Random random = new Random();
        int[] nums = null;
        nums = random.ints(10,0,100).toArray();
        return nums;
    }

    private static int[] singleSelectionSort(int[] nums){

        for (int i = 1 ; i < nums.length ; i++){
            if(nums[i] < nums[i-1]){
                int temp = nums[i - 1];
                nums[i - 1] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        int[] sortNums = getSortNums();
        System.out.println(Arrays.toString(sortNums));

        int[] nums = singleSelectionSort(sortNums);
        for(int i = 1 ; i < sortNums.length ; i++){
            nums = singleSelectionSort(nums);
        }

    }
}
