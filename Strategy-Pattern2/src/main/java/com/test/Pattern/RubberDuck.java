package com.test.Pattern;

/**
 * 橡皮鸭类，不会飞但会叫
 */

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }
    @Override
    public void quack() {
        // 覆盖成吱吱叫
        System.out.println("吱吱叫......");
    }
}
