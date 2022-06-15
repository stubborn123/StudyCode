package com.example.test.decorator.model;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/15
 * 装饰器，用来加强的
 */
public class Decorator implements Component{
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operate() {
       component.operate();
    }
}
