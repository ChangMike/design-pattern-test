package com.test.proxy8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface InvocationHandler {
	// obj是当前对象；Method后面没有s，是一个方法，就是当前方法
	public void invoke(Object obj, Method method) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
}
