package com.example.test.brige;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/9
 */
public class GasEnergy implements Ienergy{

    @Override
    public void energyType() {
        System.out.println("-------烧汽油的--------");
    }
}
