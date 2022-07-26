package com.example.test.defaultMethod;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/7/26
 */
public class Hybrid implements ElectricVehicle,FuelVehicle{
    @Override
    public void drive() {

    }


//    @Override
//    public void autoDrive() {
//        ElectricVehicle.super.autoDrive();
//    }

    @Override
    public void autoDrive() {
        FuelVehicle.super.autoDrive();
    }

//    @Override
//    public void autoDrive() {
//        System.out.println("-------Hybrid Vehicle------");
//    }


    public static void main(String[] args) {
        Hybrid hybrid = new Hybrid();
        hybrid.autoDrive();
    }

}
