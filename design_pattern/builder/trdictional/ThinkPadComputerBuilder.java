package com.example.test.builder.trdictional;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/5/19
 */
public class ThinkPadComputerBuilder extends ComputerBuilder{
    private Computer computer;
    public ThinkPadComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("小红点键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("显示器");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
