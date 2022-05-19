package com.example.test.builder.trdictional;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/5/19
 */
public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}
