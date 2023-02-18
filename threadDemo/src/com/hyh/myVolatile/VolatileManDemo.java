package com.hyh.myVolatile;

public class VolatileManDemo implements Runnable {
    @Override
    public void run() {
        VolatileMoneyDemo.money = 900000;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(Thread.currentThread().getName()+VilatileMoneyDemo.money);
    }
}
