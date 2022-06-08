package com.example.test.proxy.extend;

/**
 * @Author: zhangpeng
 * @Description: 利用继承的方式：有些我们要去扩展第三方类，但是人家也没有现成的接口给你，只能继承人家去扩展功能
 * @Date: 2022/6/8
 */
public class ExtendHouseService {
    public void saleHouse(){
        System.out.println("--------sale house start------");
        System.out.println("--------sale house end--------");
    };
}
