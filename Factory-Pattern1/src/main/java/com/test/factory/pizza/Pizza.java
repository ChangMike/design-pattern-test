package com.test.factory.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	String name;  // 名称
	String dough; // 面团类型
	String sauce; // 酱料类型
	ArrayList toppings = new ArrayList(); // 一套佐料

    // 此抽象类提供了某些默认的基本做法，准备、烘烤、切片、装盒
	// 准备，准备工作需要以特定的顺序进行，有一连串的步骤
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}
    // 烘烤
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
    // 切片
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
    // 装盒
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String )toppings.get(i) + "\n");
		}
		return display.toString();
	}
}

 
 
