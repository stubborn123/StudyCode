package com.example.test.monitor;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/4/29
 */
public class Event {

    /**
     * 类型：1 代表地瓜是监听者要监听的事件 ，2 代表茄子是监听者且子要监听的时间
     */
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
