package com.test.proxy1.Quackable;

public class Squeak implements Quackable {
    @Override
    public void quack() {
        // 覆盖成吱吱叫
        System.out.println("吱吱叫......");
    }
}
