package com.example.test.monitor;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/4/29
 */
public class MonitorDemo {

    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        DiguaMonitor diguaMonitor = new DiguaMonitor();
        QieziMonitor qieziMonitor = new QieziMonitor();


        Event event = new Event();
        event.setType(1);

        eventSource.addMonitor(diguaMonitor);
        eventSource.addMonitor(qieziMonitor);

        eventSource.gotoListener(event);

    }

}
