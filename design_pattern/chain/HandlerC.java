package com.example.test.chain;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/13
 */
//public class HandlerC extends Handler {
//    @Override
//    public void handle() {
//        boolean handled = false;
//        System.out.println("----------- C ------------");
//        //...
//        if (!handled && successor != null) {
//            successor.handle();
//        }
//    }
//}

public class HandlerC extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        //...
        return handled;
    }
}