package com.example.test.decorator.model;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/15
 */
public class ConcreteDecorate extends Decorator{
    public ConcreteDecorate(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        //todo 加强的操作
    }
}
