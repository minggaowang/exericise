package com.wang;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLock2 {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println(" await时间为" + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        try {
            lock.lock();
            System.out.println("signal时间为" + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public class ThreadA extends Thread {

        @Override
        public void run() {
            await();
        }
    }

    public static void main(String[] args) throws Exception {
        MyReentrantLock2 myReentrantLock2 = new MyReentrantLock2();
        MyReentrantLock2.ThreadA a = myReentrantLock2.new ThreadA();
        a.start();
        Thread.sleep(3000);
        myReentrantLock2.signal();
    }
}
