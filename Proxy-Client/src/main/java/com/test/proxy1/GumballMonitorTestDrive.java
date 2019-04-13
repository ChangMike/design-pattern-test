package com.test.proxy1;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        // 数组内的元素是每台机器的位置
        String[] location = {"rmi://127.0.0.1/gumballMachine","rmi://127.0.0.1/gumballMachine2"};
        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
