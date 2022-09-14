package com.example.test.mario;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/14
 */

public enum State {
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    private int value;

    private State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

