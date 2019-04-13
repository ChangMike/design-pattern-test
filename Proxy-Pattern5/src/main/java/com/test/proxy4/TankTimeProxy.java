package com.test.proxy4;

public class TankTimeProxy implements Moveable {
	Moveable moveable;
	
	public TankTimeProxy(Moveable moveable) {
		this.moveable = moveable;
	}
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		moveable.move();
		long end = System.currentTimeMillis();
		System.out.println("run time: " + (end - start) + " 毫秒");
	}
}
