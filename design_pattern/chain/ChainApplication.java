package com.example.test.chain;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/13
 */
public class ChainApplication {

    // 使用举例
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.addHandler(new HandlerC());
        chain.handle();
    }

}
