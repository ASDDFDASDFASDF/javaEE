package com.hyh.myVolatile;

public class VolatileDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new VolatileWomenDemo());
        t1.setName("小利说");
        t1.start();

        Thread t2 = new Thread(new VolatileManDemo());
        t2.setName("小路说");
        t2.start();




    }
}
