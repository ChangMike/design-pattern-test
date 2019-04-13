package com.test.proxy4;

public class Client {
	public static void main(String[] args) {
		//Moveable tank = new TankTimeProxy(new TankLogProxy(new Tank()));
		Moveable tank = new TankLogProxy(new TankTimeProxy(new Tank()));
		tank.move();
	}
}
