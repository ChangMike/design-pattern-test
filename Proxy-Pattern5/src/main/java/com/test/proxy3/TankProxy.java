package com.test.proxy3;

public class TankProxy implements Moveable {
	Moveable tank;
	
	public TankProxy(Moveable moveable) {
		this.tank = moveable;
	}
	
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		tank.move();
		long end = System.currentTimeMillis();
		System.out.println("run time: " + (end - start) + " 毫d秒");
	}
}
