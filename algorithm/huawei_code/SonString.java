package com.hw.code;

public class SonString {

    public static void main(String[] args) {

        String a = "cb";
        String b = "aab3c";
        //用while循环，两个循环,短的那个不断对比长的那个
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }

        System.out.println(i == a.length());
    }



}
