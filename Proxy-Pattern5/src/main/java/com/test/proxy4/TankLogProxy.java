package com.test.proxy4;

public class TankLogProxy implements Moveable {
	Moveable moveable;
	
	public TankLogProxy(Moveable moveable) {
		this.moveable = moveable;
	}
	@Override
	public void move() {
		System.out.println("tank start...");
		moveable.move();
		System.out.println("tank stop...");
	}
}
