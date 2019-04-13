package com.test.proxy7;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		// Tank tank = new Tank();
		Moveable tankProxy = (Moveable)Proxy.newProxyInstance(Moveable.class);
		tankProxy.move();
	}
}
