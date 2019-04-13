package com.test.proxy2;

public class Client {
	public static void main(String[] args) {
		TankProxy tank = new TankProxy();
		tank.move();
	}
}
