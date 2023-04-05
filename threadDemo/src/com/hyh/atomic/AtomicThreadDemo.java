package com.hyh.atomic;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * Atomic类是一个能确保程序执行原子操作的类
 * <p>
 * AtomicInteger自增保证原子性操作的原理是  >>>>自旋锁和csa算法<<<<
 * <p>
 * 1，如果线程栈中的副本变量 == 堆中属性变量属性值（内存值） 就将要修改的值 替换 内存zhi
 * 2.如果线程栈中副本变量 ！= 堆中内存值 修改失败 ，不做操作
 * 而是重新获取堆中内存值 （这个重新获取的动作就叫自旋）
 */
public class AtomicThreadDemo implements Runnable {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int count = atomicInteger.incrementAndGet();
            System.out.println("当前值为" + count);
        }

    }
}
