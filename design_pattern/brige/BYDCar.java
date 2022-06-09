package com.example.test.brige;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/9
 */
public class BYDCar extends Car{

    public BYDCar(Ienergy ienergy){
       call();
       ienergy.energyType();
    }

    public BYDCar(Itype itype){
        call();
        itype.carType();
    }

    @Override
    public void call() {
        System.out.println("BYD");
    }
}
