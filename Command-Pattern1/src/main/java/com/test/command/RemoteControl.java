package com.test.command;

/**
 * 遥控器类
 */
public class RemoteControl {
    // 插槽
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }
    public void buttonWasPressed() {
        slot.execute();
    }
}
