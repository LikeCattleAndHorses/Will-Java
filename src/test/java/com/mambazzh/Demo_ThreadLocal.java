package com.mambazzh;

public class Demo_ThreadLocal extends Thread {
    ThreadLocal<Object> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) {

        Thread thread_1 = new Thread("线程1");
        new Demo_ThreadLocal().setTarget(111);


        Thread thread_2 = new Thread("线程2");

        Thread thread_3 = new Thread("线程3");
    }

    public void setTarget(Object obj) {
        threadLocal.set(obj);
    }
}
