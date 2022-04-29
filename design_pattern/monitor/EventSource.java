package com.example.test.monitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/4/29
 * 对比观察者的的被观察者/主题。这个角色进行对比
 */
public class EventSource {

    /**
     * 监听器列表
     */
    private List<MyMonitor> listeners;

    /**
     * 添加监听器
     * @param myMonitor
     * @return
     */
    public List<MyMonitor> addMonitor(MyMonitor myMonitor){
        if( listeners == null ){
            listeners = new ArrayList<>();
        }
        listeners.add(myMonitor);
        return listeners;
    }

    /**
     * 移除监听器
     * @return
     */
    public List<MyMonitor> removeMonitor(){
        if(listeners == null){
            return listeners;
        }
        for (MyMonitor listener : listeners){

            if(listeners.getClass().isInstance(DiguaMonitor.class)){
                listeners.remove(listener);
            }
            if(listener.getClass().isInstance(QieziMonitor.class)){
                listeners.remove(listener);
            }

        }
        return listeners;
    }


    public void gotoListener(Event event){
        for(MyMonitor listener : listeners){
            listener.monitotToTudou(event);
        }
    }
}
