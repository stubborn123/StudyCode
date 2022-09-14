package com.example.test.chain;

//public class HandlerA extends Handler {
//    @Override
//    public void handle() {
//        boolean handled = false;
//        System.out.println("----------- A ------------");
//        //...
//        if (!handled && successor != null) {
//            successor.handle();
//        }
//    }
//}

public class HandlerA extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        //...
        return handled;
    }
}