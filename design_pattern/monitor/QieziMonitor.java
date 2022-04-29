package com.example.test.monitor;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/4/29
 */
public class QieziMonitor implements MyMonitor{
    @Override
    public void monitotToTudou(Event event) {
        if(event.getType() == 2){
            System.out.println("地瓜，地瓜，我是茄子,我听到了!");
        }
    }
}
