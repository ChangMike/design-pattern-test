package com.test.proxy1;

import java.util.Random;

public class Tank {
	public void move() {
		long start = System.currentTimeMillis();
		try {
			System.out.println("Tank moving...");
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("run time: " + (end - start) + " 毫秒");
	}
}
