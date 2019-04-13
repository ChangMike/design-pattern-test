package com.test.proxy3;

public class Client {
	public static void main(String[] args) {
		Moveable tank = new TankProxy(new Tank());
		tank.move();
	}
}
