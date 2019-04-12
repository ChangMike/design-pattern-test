package com.test.Pattern;

public class MyTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

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
        rubberDuck.fly();

        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.quack();
        decoyDuck.fly();
    }
}
