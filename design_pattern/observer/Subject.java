package com.example.test.observer;

import java.util.List;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/4/29
 * @Desc:subject 被观察者（主题发布的主题）
 */
public interface Subject {

    /**
     * 添加观察者
     * @return
     */
    public List<Observer> addObserver(Observer observer);

    /**
     * 删除某个观察者
     * @param observer
     * @return
     */
//    public List<Observer> removeObserve(Observer observer);

    /**
     * 发送消息/主题，让观察者动起来
     */
    public void sendSubjectToObserver();


}
