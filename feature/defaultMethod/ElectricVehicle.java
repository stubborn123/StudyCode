package com.example.test.defaultMethod;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/7/26
 */
public interface ElectricVehicle extends Vehicle{
    @Override
    default void autoDrive() {
        System.out.println("--------Electric vehicle-----");
    }
}
