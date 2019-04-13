package com.test.proxy1;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import static java.lang.reflect.Proxy.newProxyInstance;

public class MatchMakingTestDrive {
	Hashtable datingDB = new Hashtable();
	void initializeDatabase() {
		PersonBean zs = new PersonBeanImpl();
		zs.setName("zhangsan");
		zs.setInterests("汽车, 计算机, 音乐");
		zs.setHotOrNotRating(0);
		datingDB.put(zs.getName(), zs);

		PersonBean ls = new PersonBeanImpl();
		ls.setName("LiSi");
		ls.setInterests("淘宝, 逛街, 音乐");
		ls.setHotOrNotRating(2);
		datingDB.put(ls.getName(), ls);
	}
	public MatchMakingTestDrive() {
		initializeDatabase();
	}
 	
	public static void main(String[] args) throws IOException {
		// 创建测试类，会执行initializeDatabase方法，即初始化一个Hashtable
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	public void drive() throws IOException {
		PersonBean zs = (PersonBean)datingDB.get("zhangsan");
		PersonBean ownerProxy = getOwnerProxy(zs);
		System.out.println("姓名：" + ownerProxy.getName());
		ownerProxy.setInterests("保龄球, 编程");
		System.out.println("通过拥有者代理设置自己的爱好");
		System.out.println(zs.getInterests());
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("不可以通过拥有者代理设置自己的评分");
		}
		System.out.println("评分：" + ownerProxy.getHotOrNotRating());

		PersonBean nonOwnerProxy = getNonOwnerProxy(zs);
		System.out.println("姓名：" + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("保龄球, 编程");
		} catch (Exception e) {
			System.out.println("不可以通过非拥有者代理设置自己的爱好");
		}
		nonOwnerProxy.setHotOrNotRating(7);
		System.out.println("通过非拥有者代理设置自己的评分");
		System.out.println("评分：" + nonOwnerProxy.getHotOrNotRating());


		byte[] bts = ProxyGenerator.generateProxyClass("$GameProxy", zs.getClass().getInterfaces());
		FileOutputStream fos = new FileOutputStream(new File("D:/$GameProxy.class"));
		fos.write(bts);
		fos.flush();
		fos.close();
	}

	PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) newProxyInstance(
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
	}

	PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) newProxyInstance(
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
	}
}
