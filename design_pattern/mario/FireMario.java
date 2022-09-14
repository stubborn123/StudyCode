package com.example.test.mario;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/14
 */
public class FireMario implements IMario{

    private MarioStateMachine stateMachine;

    public FireMario(MarioStateMachine stateMachine){
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }

    @Override
    public void obtainMushRoom() {
        // do nothing...
    }

    @Override
    public void obtainCape() {
        // do nothing...
    }

    @Override
    public void obtainFireFlower() {
        // do nothing...
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 300);
    }
}
