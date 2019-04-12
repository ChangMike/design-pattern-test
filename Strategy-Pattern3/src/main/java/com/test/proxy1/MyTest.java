package com.test.proxy1;

import com.test.proxy1.Flyable.FlyRocketPowered;

public class MyTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyable(new FlyRocketPowered());
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
