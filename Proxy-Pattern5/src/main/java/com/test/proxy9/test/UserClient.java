package com.test.proxy9.test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import com.test.proxy9.proxy.Proxy;
import com.test.proxy9.proxy.TransactionHandler;
import com.test.proxy9.user.UserManager;
import com.test.proxy9.user.UserManagerImpl;

public class UserClient {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		TransactionHandler handler = new TransactionHandler(new UserManagerImpl());
		
		UserManager tankProxy = (UserManager)Proxy.newProxyInstance(UserManager.class, handler);
		
		tankProxy.addUser();
	}
}
