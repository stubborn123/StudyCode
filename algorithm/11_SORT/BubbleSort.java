package com.zp.geek.algo.sort_11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * 冒泡排序
 * 其实最重要的还是掌握原理
 * 冒泡排序就是从最底下那个开始两两比较，最后一直到最顶上
 * 底下第二个依次
 */
public class BubbleSort {



    private static int[] getSortNums(){
        Random random = new Random();
        int[] nums = null;
        nums = random.ints(10,0,100).toArray();
        return nums;
    }

    private static void toSingleBubbleSort( int[] nums ){
        for(int i = 0 ;i < nums.length - 1; i++ ){

            if( nums[i] > nums[i+1]){
                int temp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] sortNums = getSortNums();
        System.out.println(Arrays.toString(sortNums));

        for( int i = 0 ; i < sortNums.length-1; i++ ){
            toSingleBubbleSort(sortNums);
            System.out.println(Arrays.toString(sortNums));
        }



    }



}
