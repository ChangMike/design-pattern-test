package com.test.proxy1;

import java.rmi.RemoteException;

/**
 * 糖果监视器
 */
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.err.println("糖果机位置：" + machine.getLocation());
            System.err.println("此糖果机当前糖果数目：" + machine.getCount());
            System.err.println("此糖果机当前状态：" + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
