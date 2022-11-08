package com.example.test.leetCode;

/**
 * @Author: zhangpeng
 * @Description:罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * 感觉类似十进制里面带了个5进制
 * 1 < num < 3999  注意这个条件 （实际上罗马数字超过4000，4000就有自己特殊符号了）
 * 转换罗马数字
 * @Date: 2022/11/8
 */
public class IntToRoman {

    public String intToRoman(int num) {
       String result = "";
       if(num<=0){
           return result;
       }

       //首先他这个是有限制的，1 < num < 3999
       //实际上4和9，比较特殊，将其在范围内特殊情况可以穷举出来
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < 13) {
            // 特别注意：这里是等号
            while (num >= nums[index]) {
                stringBuilder.append(romans[index]);
                System.out.println("----nums[index] "+ nums[index]);
                num -= nums[index];
            }
            index++;
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        IntToRoman t = new IntToRoman();
        String result = t.intToRoman(2022);
        System.out.println(result);
    }

}
