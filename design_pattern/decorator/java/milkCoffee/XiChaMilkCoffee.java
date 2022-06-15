package com.example.test.decorator.milkCoffee;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/15
 */
public class XiChaMilkCoffee implements MilkCoffee{
    @Override
    public void make() {
        System.out.println("--------勾兑一下");
    }
}
