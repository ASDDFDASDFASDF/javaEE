package com.hyh.myVolatile;

/**
 * volatile关键字
 *
 * 小结：(volatile 关键字只能规定当前线程在使用变量时去堆中看一下变量的值，但是如果其他线程还没来得及将修改后的值更新到堆的变量，那么当前线程看到的依然是旧值)
 * 堆内存是唯一的，每一个线程都有自己的线程栈
 * 每个线程在使用堆里面变量的时候，先复制一份在自己的线程栈中
 * 在线程中，每次使用的都是线程内的变量副本
 */

public class VolatileMoneyDemo {
    public static volatile   int money = 100000;
    private static Object lock = new Object();
}
