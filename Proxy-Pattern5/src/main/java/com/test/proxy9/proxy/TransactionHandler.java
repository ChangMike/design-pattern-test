package com.test.proxy9.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TransactionHandler implements InvocationHandler  {
	// 被代理的对象
	private Object target;
	public TransactionHandler(Object target) {
		this.target = target;
	}
	@Override
	public void invoke(Object obj, Method method)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("save point");
		try {
			method.invoke(target);
			//int i = 9/0;
			System.out.println("commit");
		} catch (Exception e) {
			System.out.println("rollback");
		}
		
	}

}
