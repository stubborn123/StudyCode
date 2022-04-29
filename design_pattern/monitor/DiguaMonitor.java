package com.example.test.monitor;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/4/29
 */
public class DiguaMonitor implements MyMonitor{
    @Override
    public void monitotToTudou(Event event) {

       if(event.getType() == 1){
           System.out.println("地瓜，地瓜，我是土豆,我听到了!");
       }

    }
}
