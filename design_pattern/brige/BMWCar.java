package com.example.test.brige;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/9
 */
public class BMWCar extends Car{

    public BMWCar(Ienergy ienergy){
        call();
       ienergy.energyType();
    }

    public BMWCar(Itype itype){
        call();
        itype.carType();
    }

    @Override
    public void call() {
        System.out.println("BMW");
    }
}
