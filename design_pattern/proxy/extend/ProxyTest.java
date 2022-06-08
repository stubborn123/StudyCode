package com.example.test.proxy.extend;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/8
 */
public class ProxyTest {
    public static void main(String[] args) {
        ExtendHouseService extendHouseService = new ProxyHouseService(false);
        extendHouseService.saleHouse();
    }
}
