package com.example.test.brige;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/9
 */
public class ClientTest {
    public static void main(String[] args) {

        Ienergy gas = new GasEnergy();
        Ienergy electric = new ElectricEnergy();
        Car bmw = new BMWCar(gas);
        Car byd = new BYDCar(electric);

        Itype suv = new SuvType();
        Car bmw2 = new BMWCar(suv);

    }
}
