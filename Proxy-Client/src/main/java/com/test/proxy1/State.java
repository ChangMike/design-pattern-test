package com.test.proxy1;

import java.io.Serializable;

/**
 * 状态接口，有四个方法，投入硬币、退回硬币、转动曲柄、发放糖果
 * 转动曲柄方法最后会调用分配糖果方法
 */
public interface State extends Serializable {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
