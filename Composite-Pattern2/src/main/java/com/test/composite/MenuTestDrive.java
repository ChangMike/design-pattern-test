package com.test.composite;

import com.test.composite.menu.Menu;
import com.test.composite.menu.MenuComponent;
import com.test.composite.menu.MenuItem;

public class MenuTestDrive {
	public static void main(String args[]) {
		MenuComponent allMenus = new Menu("总菜单", "所有餐厅的菜单");
		MenuComponent kfcMenu = new Menu("肯德基菜单", "来自美国的美食");
		MenuComponent chinaMenu = new Menu("煎饼店菜单", "来自中国的美食");
		MenuComponent ziCaiDan = new Menu("肯德基饮料菜单", "这是肯德基的子菜单");

		allMenus.add(kfcMenu);
		allMenus.add(chinaMenu);
		kfcMenu.add(ziCaiDan);

		MenuComponent hanBao = new MenuItem("汉堡", "大面包", 10.00, true);
		MenuComponent shuTiao = new MenuItem("薯条", "土豆条", 5.00, true);
		MenuComponent piSa = new MenuItem("比萨", "披萨", 20.00, false);
		MenuComponent yiMian = new MenuItem("意大利面", "面条", 15.00, false);
		kfcMenu.add(hanBao);
		kfcMenu.add(shuTiao);
		kfcMenu.add(piSa);
		kfcMenu.add(yiMian);
		MenuComponent keLe =  new MenuItem("可口可乐", "一种黑色饮料", 3.00, true);
		MenuComponent bingJiLin =  new MenuItem("冰淇淋", "一种冷饮", 5.00, true);
		MenuComponent guoZhi =  new MenuItem("果汁", "一种水果榨汁饮料",  10.00, true);
		MenuComponent piJiu =  new MenuItem("啤酒", "一种低度酒精饮料", 5.00, true);
		ziCaiDan.add(keLe);
		ziCaiDan.add(bingJiLin);
		ziCaiDan.add(guoZhi);
		ziCaiDan.add(piJiu);

		MenuComponent rouJiaBing =  new MenuItem("肉夹饼", "肉夹馍", 8.00, false);
		MenuComponent paoMo =  new MenuItem("羊肉泡馍", "陕西美食", 20.00, false);
		MenuComponent JianBing =  new MenuItem("土豆丝煎饼", "一种薄饼",  10.00, true);
		MenuComponent danJiaBing =  new MenuItem("蛋夹饼", "蛋夹馍", 5.00, true);
		chinaMenu.add(rouJiaBing);
		chinaMenu.add(paoMo);
		chinaMenu.add(JianBing);
		chinaMenu.add(danJiaBing);

		Waiter waiter = new Waiter(allMenus);
		//waiter.printMenu();
		waiter.printVegetarianMenu();
	}
}
