package com.test.proxy2;

public class TankProxy extends Tank {
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		super.move();
		long end = System.currentTimeMillis();
		System.out.println("run time: " + (end - start) + " 毫秒");
	}
}
