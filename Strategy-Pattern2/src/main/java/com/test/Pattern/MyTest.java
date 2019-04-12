package com.test.Pattern;

public class MyTest {
    public static void main(String[] args) {
        // 这里不可以使用多态，因为有些方法定义在子类中；否则定义在子类中的方法就无法调用
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();
        mallardDuck.fly();

        redHeadDuck.display();
        redHeadDuck.swim();
        redHeadDuck.quack();
        redHeadDuck.fly();

        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();

        decoyDuck.display();
        decoyDuck.swim();
    }
}
