package com.example.test.mario;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/14
 */
public interface IMario { //所有状态类的接口
    State getName();
    //以下是定义的事件
    void obtainMushRoom();
    void obtainCape();
    void obtainFireFlower();
    void meetMonster();
}
