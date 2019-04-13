package com.test.proxy1;

public class MyTest {
    public static void main(String[] args) {
        // 真正的火鸡对象
        WildTurkey turkey = new WildTurkey();
        // 真正的鸭子对象
        MallardDuck duck = new MallardDuck();
        // 适配器对象，火鸡冒充鸭子
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("-------------------火鸡-------------------");
        turkey.gobble();
        turkey.fly();
        System.out.println("-------------------鸭子-------------------");
        testDuck(duck);
        System.out.println("----------适配器类，火鸡冒充鸭子-----------");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
