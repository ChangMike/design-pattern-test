package com.test.pattern;

import com.test.pattern.bread.BlackBread;
import com.test.pattern.bread.Bread;
import com.test.pattern.bread.HoneyBread;
import com.test.pattern.bread.WhiteBread;
// 面包工厂类
public class BreakFactory {
    public static Bread getBread(int type) {
        Bread bread = null;
        switch (type) {
            // 黑面包
            case 1: bread = new BlackBread();
            break;
            // 白面包
            case 2: bread = new WhiteBread();
            break;
            // 蜂蜜面包
            case 3: bread = new HoneyBread();
            break;
        }
        return bread;
    }
}
