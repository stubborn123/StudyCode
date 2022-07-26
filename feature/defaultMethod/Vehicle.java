package com.example.test.defaultMethod;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/7/26
 */
public interface Vehicle {

    void drive();

    default void autoDrive(){
        System.out.println(" --------vehicle drive-------  ");
    }

}
