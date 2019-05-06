#### 观察者模式（使用了面向接口和组合）
##### Observer-Pattern1
- 功能完整，但这不是观察者模式
```
    currentConditionsDisplay.update(temperatrue, humidity, pressure);
    statisticsDisplay.update(temperatrue, humidity, pressure);
    forecastDisplay.update(temperatrue, humidity, pressure);
```
- 封装变化，面向接口，组合，解耦，开放关闭
    <details>
    <summary>详细</summary>

    - 现在只有三个布告板，当前天气、天气统计、天气预报，但以后可能会添加其它的布告板，比如酷热指数布告板-->封装变化
    - currentConditionsDisplay、statisticsDisplay、forecastDisplay都是具体的实现；观察者都有一个方法update，为了能让发布者以统一的方法通知观察者-->面向接口编程
    - 接着互相组合
    - 松耦合，开放关闭
    </details>

---
##### Observer-Pattern2
- 这是观察者模式
---
##### Observer-PatternJDK
JDK观察者模式的黑暗面
- Observable是一个具体类，需要继承它-->面向接口编程-->java单继承
- 并且它的setChanged方法是受保护的，如果想使用组合-->受保护的方法无法被调用 


