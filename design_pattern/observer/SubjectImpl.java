package com.example.test.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/4/29
 */
public class SubjectImpl implements Subject{

    List<Observer> list;

    @Override
    public List<Observer> addObserver(Observer observer) {
        if(list == null){
            list = new ArrayList<>();
        }
        list.add(observer);
        return list;
    }

    @Override
    public void sendSubjectToObserver() {
         for(Observer observer : list){
              observer.sendSubject();
         }
    }
}
