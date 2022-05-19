package com.example.test.builder;

import com.alibaba.fastjson.JSONObject;
import com.example.test.builder.trdictional.Computer;
import com.example.test.builder.trdictional.ComputerBuilder;
import com.example.test.builder.trdictional.ComputerDirector;
import com.example.test.builder.trdictional.ThinkPadComputerBuilder;

import java.time.LocalDate;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/5/19
 */
public class OrderTest {
    public static void main(String[] args) {
        OrderTest test = new OrderTest();
        Order order = new Order.Builder().setOrderNo("orderXXXX")
                .setConfirmDate(LocalDate.now())
                .setOrderStatus(1)
                .build();
        System.out.println(JSONObject.toJSONString(order));

        //传统比较正规的创建者模式：director 创建 builder 组装builder实例
        ComputerDirector computerDirector = new ComputerDirector();
        ComputerBuilder builder = new ThinkPadComputerBuilder("i5","8G");
        builder.setKeyboard();
        builder.setDisplay();
        builder.setDisplay();
        computerDirector.makeComputer(builder);
        Computer computer = builder.getComputer();
        System.out.println(builder.toString());
        System.out.println(computer.toString());
    }
}
