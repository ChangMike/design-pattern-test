package com.test.command;

import com.test.command.command.LightOffCommand;
import com.test.command.command.LightOnCommand;
import com.test.command.command.StereoOffCommand;
import com.test.command.command.StereoOnCommand;
import com.test.command.electrical.appliances.Light;
import com.test.command.electrical.appliances.Stereo;

public class MyTest {
    public static void main(String[] args) {
        // 创建遥控器对象
        RemoteControl remoteControl = new RemoteControl();
        // 创建电器对象
        Light light = new Light();
        Stereo stereo = new Stereo();
        // 创建电灯命令对象
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        // 创建音响命令对象
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        // 设置遥控器对象的按钮，0按钮设置为电灯，1按钮设置为音响
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnCommand, stereoOffCommand);
        // 输出遥控器按钮设置
        System.out.println(remoteControl);
        // 按下按钮
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

    }
}
