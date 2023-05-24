package com.zp.design.creation.singleton;

/**
 * @Author: zhangpeng
 * @Description: 饿汉模式
 * 通过构造函数private访问权限，来禁止new保证单例
 * @Date: 2023/5/24
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}

