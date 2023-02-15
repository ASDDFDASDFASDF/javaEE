package com.hyh.案例;

public class Cooker implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.obj) {
                if (Desk.count == 0) {
                    Desk.count++;
                    Desk.obj.notifyAll();
                    System.out.println("汉堡包做好了");
                } else {
                    try {
                        Desk.obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
