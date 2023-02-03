package com.mambazzh.demo;

import java.util.Iterator;
import java.util.StringTokenizer;

abstract class DemoAbstract {

    final void methodA() {
        System.out.println("调用");
    }
    abstract void methodB();

    public static void main(String[] args) {
        StringTokenizer helloworld = new StringTokenizer("hello world object");
//        Iterator<Object> objectIterator = helloworld.asIterator();
//        if (objectIterator.hasNext()){
//            Object next = objectIterator.next();
//            System.out.println(objectIterator.next());
//        }

//        System.out.println(helloworld.nextToken());
    }
}