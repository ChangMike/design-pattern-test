package com.test.proxy1.state;

import com.test.proxy1.GumballMachine;

public class WinnerState implements State {
    transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("稍候片刻，糖果发放中...");
    }
    @Override
    public void ejectQuarter() {
        System.out.println("稍候片刻，糖果发放中...");
    }
    @Override
    public void turnCrank() {
        System.out.println("多次转运曲柄并不会多给您糖果哟！");
    }
    @Override
    public void dispense() {
        System.out.println("恭喜您，您中奖了，会发放给您两颗糖果！");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("请告诉管理员放入糖果！");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
    public String toString() {
        return "您中奖了，会发放给您两颗糖果！";
    }
}
