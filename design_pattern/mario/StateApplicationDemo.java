package com.example.test.mario;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/14
 */
public class StateApplicationDemo {

    public static void main(String[] args) {
        //初始化状态
        MarioStateMachine mario = new MarioStateMachine();
        //采蘑菇
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);

        //获取火道具
        mario.obtainFireFlower();
        System.out.println("mario score: " + mario.getScore() + "; state: " + mario.getCurrentState());

        //遇到怪兽没躲开
        mario.meetMonster();
        System.out.println("mario score: " + mario.getScore() + "; state: " + mario.getCurrentState());
    }
}