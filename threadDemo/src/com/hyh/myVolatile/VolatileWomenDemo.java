package com.hyh.myVolatile;

public class VolatileWomenDemo implements  Runnable {
    @Override
    public void run() {
        while (VolatileMoneyDemo.money == 100000){

        }

        System.out.println(Thread.currentThread().getName()+"只剩下"+ VolatileMoneyDemo.money);
    }
}
