package com.example.test.builder.trdictional;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/5/19
 */
public abstract class ComputerBuilder {
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}
