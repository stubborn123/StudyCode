package com.example.test.proxy.normal;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/8
 */
public class HouseTest {
    public static void main(String[] args) {

           HouseService houseService = new ProxyHouseAgent(new HouseServiceImpl());
           houseService.saleHouse();

    }
}
