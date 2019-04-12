package com.test.state;

public class MyTest {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);

		// 投入硬币
		gumballMachine.insertQuarter();
		// 转动曲柄
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

		// 投入硬币
		gumballMachine.insertQuarter();
		// 退回硬币
		gumballMachine.ejectQuarter();
		// 转动曲柄
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

		// 投入硬币
		gumballMachine.insertQuarter();
		// 转动曲柄
		gumballMachine.turnCrank();
		// 投入硬币
		gumballMachine.insertQuarter();
		// 转动曲柄
		gumballMachine.turnCrank();
		// 退回硬币
		gumballMachine.ejectQuarter();
		System.out.println(gumballMachine);

		// 投入硬币
		gumballMachine.insertQuarter();
		// 投入硬币
		gumballMachine.insertQuarter();
		// 转动曲柄
		gumballMachine.turnCrank();
		// 投入硬币
		gumballMachine.insertQuarter();
		// 转动曲柄
		gumballMachine.turnCrank();
		// 投入硬币
		gumballMachine.insertQuarter();
		// 转动曲柄
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}
}
