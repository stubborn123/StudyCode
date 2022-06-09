package com.example.test.brige;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/9
 */
public class ElectricEnergy implements Ienergy{
    @Override
    public void energyType() {
        System.out.println("-------充电的------");
    }
}
