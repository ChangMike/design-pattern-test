package com.test.proxy1;

public class GumballMachineTestDrive {
	/**
	 * 这个项目只是添加了一个监视器而已
	 */
	public static void main(String[] args) {
		args = new String[2];
		args[0] = "上海";
		args[1] = "20";

		int count = 0;

		if (args.length < 2) {
			System.out.println("糖果机 <名称> <糖果数目>");
			System.exit(1);
		}

		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine = new GumballMachine(args[0], count);

		GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);


		gumballMonitor.report();

	}
}
