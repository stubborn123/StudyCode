package com.example.test.decorator.milkCoffee;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/15
 */
public class AddCoconut extends AddSomeThing{
    public AddCoconut(MilkCoffee mc) {
        super(mc);
    }

    @Override
    public void make() {
        super.make();
        System.out.println("加点椰果");
    }
}
