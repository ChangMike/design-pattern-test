package com.test.state;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(10);
		System.out.println(gumballMachine);

		for (int i = 0; i < 10; i++) {
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			System.out.println(gumballMachine);
		}
	}
}
