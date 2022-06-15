package com.example.test.decorator.milkCoffee;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/15
 */
public class AddSomeThing implements MilkCoffee{

    private MilkCoffee milkCoffee;

    public AddSomeThing(MilkCoffee mc){
        this.milkCoffee = mc;
    }

    @Override
    public void make() {

    }
}
