package com.test.proxy1;

import com.test.proxy1.remote.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		args = new String[] {"127.0.0.1", "100"};

		GumballMachineRemote gumballMachine;
		int count = 0;

		if (args.length < 2) {
			System.out.println("糖果机 <名称> <糖果数目>");
			System.exit(1);
		}
		try {
			count = Integer.parseInt(args[1]);
			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballMachine", gumballMachine);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
