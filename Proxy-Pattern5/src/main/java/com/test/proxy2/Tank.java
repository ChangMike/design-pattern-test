package com.test.proxy2;

import java.util.Random;

public class Tank {
	public void move() {
		try {
			System.out.println("Tank moving...");
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
