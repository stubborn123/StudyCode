package com.example.test.chain;

//public class HandlerB extends Handler {
//    @Override
//    public void handle() {
//        boolean handled = false;
//        System.out.println("-----------  B ------------");
//        //...
//        if (!handled && successor != null) {
//            successor.handle();
//        }
//    }
//}

public class HandlerB extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        //...
        return handled;
    }
}