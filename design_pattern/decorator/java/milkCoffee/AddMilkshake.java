package com.example.test.decorator.milkCoffee;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/15
 */
public class AddMilkshake extends AddSomeThing{
    private MilkCoffee milkCoffee;

    public AddMilkshake(MilkCoffee mc) {
        super(mc);
        this.milkCoffee = mc;
    }

    @Override
    public void make() {
        milkCoffee.make();
        System.out.println("加点奶昔");
    }
}
