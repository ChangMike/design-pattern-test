package com.test.proxy1.state;

import com.test.proxy1.GumballMachine;

/**
 * 实现状态接口，糖果售磬状态
 */
public class SoldOutState implements State {
    transient GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("糖果售磬，请勿投币！");
	}
 
	public void ejectQuarter() {
		System.out.println("糖果已售磬，所以我没有接受过您的投币，同样也无法退回");
	}
 
	public void turnCrank() {
		System.out.println("糖果已售磬！");
	}
 
	public void dispense() {
		System.out.println("糖果已售磬！");
	}
 
	public String toString() {
		return "糖果已售磬！";
	}
}
