package com.zp.geek.algo.sort_11;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InsertionSort2 {



    private static int[] getSortNums(){
        Random random = new Random();
        int[] nums = null;
        nums = random.ints(10,0,100).toArray();
        return nums;
    }

    //这个是参照极客时间的事例代码，属于原地算法，就是不参加空间

    /**
     *  @param nums  排序数组
     * @param length 排序数组大小（其实这个可以省略）    */
    private static  void singleInsertionSort(Integer[] nums, int length ){
        if(length <= 1){
            return;
        }

        //排序有序数组
        for ( int i = 1 ; i < length ; i++){
            int j = i - 1;
            if( nums[i] < nums[j] ){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

        }
//        int[] sortNums = Arrays.stream(nums).mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(nums));

    }


    public static void main(String[] args) {
        int[] sortNums = getSortNums();
        System.out.println(Arrays.toString(sortNums));
        List<Integer> list = Lists.newArrayList();

        for(int i = 0 ; i < sortNums.length ; i++ ){

            list.add(sortNums[i]);
            singleInsertionSort((Integer[] )list.toArray(new Integer[list.size()]) ,list.size());
        }
    }
}
