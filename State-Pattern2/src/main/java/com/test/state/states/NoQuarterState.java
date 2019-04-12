package com.test.state.states;

import com.test.state.GumballMachine;

/**
 * 实现状态接口，等待投入硬币状态
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("投币成功！");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("您没有投入过硬币！");
	}
 
	public void turnCrank() {
		System.out.println("您还没有投币！");
	 }
 
	public void dispense() {
		System.out.println("您还没有投币！");
	} 
 
	public String toString() {
		return "请您投币！";
	}
}
