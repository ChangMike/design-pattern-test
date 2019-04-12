package com.test.state;
/*
 *  糖果机
 *  sold 卖
 *  quarter 美国或加拿大的25分硬币
 *  gumball 软糖
 */
public class GumballMachine {

	// 糖果售磬
	final static int SOLD_OUT = 0;
	// 还没有投入硬币，等待投入硬币
	final static int NO_QUARTER = 1;
	// 已投入硬币
	final static int HAS_QUARTER = 2;
	// 售出糖果
	final static int SOLD = 3;
 	// 糖果的初始状态设置为售磬
	int state = SOLD_OUT;
	// 糖果数量
	int count = 0;
  	// 构造方法，如果投入糖果，状态变更为待投入硬币状态
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
	// 补充糖果
	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUARTER;
	}
  	// 投入硬币
	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("不要多次投入硬币！");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("投币成功！");
		} else if (state == SOLD_OUT) {
			System.out.println("糖果售磬，请勿投币！");
		} else if (state == SOLD) {
        	System.out.println("稍候片刻，糖果发放中...");
		}
	}
	// 退回硬币
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("已退回硬币，请您收好！");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("您没有投入过硬币！");
		} else if (state == SOLD) {
			System.out.println("对不起, 您已经转运过曲柄了，不能退回了！");
		} else if (state == SOLD_OUT) {
        	System.out.println("糖果已售磬，所以我没有接受过您的投币，同样也无法退回");
		}
	}
	// 转动曲柄，这个方法最后会调用分配糖果方法
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("多次转运曲柄并不会多给您糖果哟！");
		} else if (state == NO_QUARTER) {
			System.out.println("您还没有投币！");
		} else if (state == SOLD_OUT) {
			System.out.println("糖果已售磬！");
		} else if (state == HAS_QUARTER) {
			System.out.println("转运曲柄成功！");
			state = SOLD;
			dispense();
		}
	}
 	// 分配糖果
	public void dispense() {
		if (state == SOLD) {
			System.out.println("一个糖果已发放！");
			count = count - 1;
			if (count == 0) {
				System.out.println("请告诉管理员放入糖果！");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("您还没有投币！");
		} else if (state == SOLD_OUT) {
			System.out.println("糖果已售磬！");
		} else if (state == HAS_QUARTER) {
			System.out.println("没有糖果可以发放！");
		}
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n大白兔糖果");
		result.append("还有: " + count + " 颗");
		result.append("\n糖果机");
		if (state == SOLD_OUT) {
			result.append("已售磬！");
		} else if (state == NO_QUARTER) {
			result.append("等待您投入硬币！");
		} else if (state == HAS_QUARTER) {
			result.append("等待您转运曲柄！");
		} else if (state == SOLD) {
			result.append("提醒您收好糖果！");
		}
		result.append("\n");
		return result.toString();
	}
}


