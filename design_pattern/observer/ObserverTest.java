package com.example.test.observer;

import java.util.List;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/4/29
 */
public class ObserverTest  {

    public static void main(String[] args) {
      SubjectImpl subject = new SubjectImpl();
      subject.addObserver(new ObserverA());
      subject.addObserver(new ObserverB());

      subject.sendSubjectToObserver();

    }

}
