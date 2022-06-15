package com.example.test.decorator.milkCoffee;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/15
 */
public class ClientTest {
    public static void main(String[] args) {
        MilkCoffee xicha = new XiChaMilkCoffee();
        AddMilkshake addMilkshake = new AddMilkshake(xicha);
        addMilkshake.make();
    }
}
