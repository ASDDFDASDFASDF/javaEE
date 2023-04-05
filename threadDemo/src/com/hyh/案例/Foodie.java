package com.hyh.案例;

public class Foodie implements Runnable {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.obj) {
                if (Desk.count > 0) {//有汉堡
                    System.out.println("汉堡好好吃");
                    Desk.obj.notifyAll();
                    Desk.count--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        System.out.println("没有汉堡啦");
                        Desk.obj.wait();//使用什么对象当作锁，那么就必须用这个对象去调用锁的唤醒和等待方法。
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }
}
