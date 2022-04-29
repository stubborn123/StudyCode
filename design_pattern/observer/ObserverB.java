package com.example.test.observer;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/4/29
 */
public class ObserverB extends Observer{
    @Override
    public void sendSubject() {
        System.out.println("我是观察者B");
    }
}
