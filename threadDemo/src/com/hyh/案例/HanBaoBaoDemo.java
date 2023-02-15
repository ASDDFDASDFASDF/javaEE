package com.hyh.案例;

public class HanBaoBaoDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Foodie());
        t1.start();

        Thread t2 = new Thread(new Cooker());
        t2.start();


    }
}
