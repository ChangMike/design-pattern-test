package com.test.proxy1.state;

import com.test.proxy1.GumballMachine;

import java.util.Random;

/**
 * 实现状态接口，已投入硬币状态
 */
public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	Random random = new Random(System.currentTimeMillis());
 
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
		int winner = random.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("没有糖果可以发放！");
    }
 
	public String toString() {
		return "请您转动曲柄！";
	}
}
