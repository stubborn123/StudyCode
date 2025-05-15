package com.hw.code;

/*
给出原文字符串str，通过对字符串的每个字母进行改变来实现加密，加密方式是在每一个字母str[i]偏移特定数组元素a[i]的量。
数组a的前三位已经赋值：a[0]=1,a[1]=2,a[2]=4,当i>=3时，数组元素a[i]=a[i-1]+a[i-2]+a[i-3]。
例如：原文abcde加密后bdgkr，其中偏移量分别是1，2，4，7，13。 输入描述：第一行是整数n，表示n组测试数据。
每组数据包含一行，原文str(只含有小写字母，长度大于0小于50)。
 */
public class EncryptString {

    public static void main(String[] args) {

    }

    public static String encryptString(String str) {
        int[] a = new int[50];
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;
        for (int i = 3; i < str.length(); i++) {
            a[i] = a[i - 1] + a[i - 2] + a[i - 3];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append((char) (str.charAt(i) + a[i]));
        }
        return sb.toString();
    }

}
