package com.test.proxy8;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		// new Tank()会被组合为TimeHandler的成员变量
		InvocationHandler handler = new TimeHandler(new Tank());
		// Moveable.class为哪个接口生成代理类；handler里包含目标对象，还有一个invoke()方法
		Moveable tankProxy = (Moveable)Proxy.newProxyInstance(Moveable.class, handler);
		// tankProxy是一个真正的java对象，这个对象是代理类的实例对象；这个对象有move方法，所以可以调用
		tankProxy.move();
	}
}
