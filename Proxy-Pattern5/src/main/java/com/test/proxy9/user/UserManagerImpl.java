package com.test.proxy9.user;

public class UserManagerImpl implements UserManager {
	@Override
	public void addUser() {
		System.out.println("插入一条用户信息到用户表");
		System.out.println("插入此用户的头像到头像表");
	}
}
