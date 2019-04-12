package com.test.state.states;

import com.test.state.GumballMachine;

/**
 * 实现状态接口，已投入硬币状态
 */
public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("不要多次投入硬币！");
	}
 
	public void ejectQuarter() {
		System.out.println("已退回硬币，请您收好！");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("转运曲柄成功！");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("没有糖果可以发放！");
    }
 
	public String toString() {
		return "请您转动曲柄！";
	}
}
