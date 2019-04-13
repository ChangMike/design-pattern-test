package com.test.proxy1.state;

import com.test.proxy1.GumballMachine;

/**
 * 实现状态接口，糖果发放状态
 */
public class SoldState implements State {

	transient GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("稍候片刻，糖果发放中...");
	}
 
	public void ejectQuarter() {
		System.out.println("对不起, 您已经转运过曲柄了，不能退回了！");
	}
 
	public void turnCrank() {
		System.out.println("多次转运曲柄并不会多给您糖果哟！");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("请告诉管理员放入糖果！");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "一个糖果已发放！";
	}
}


