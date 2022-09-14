package com.example.test.chain;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/13
 */

//public abstract class Handler {
//    protected Handler successor = null;
//
//    public void setSuccessor(Handler successor) {
//        this.successor = successor;
//    }
//
//    public abstract void handle();
//}

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
