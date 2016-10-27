package com.concurrent;

import java.util.ArrayList;

/**
 * Created by zy118686 on 16/10/21.
 */
public class TestMyLocks {

    private SimpleSpinLock simpleSpinLock = new SimpleSpinLock();

    int num = 0;

    public void testSimpleSpinLock(){
        System.out.println(Thread.currentThread().getName()+"正在尝试获得锁");
        simpleSpinLock.lock();
        System.out.println(Thread.currentThread().getName()+"获得锁");
        Long times =System.currentTimeMillis();
        num++;
        System.out.println(Thread.currentThread().getName()+"释放锁");
        simpleSpinLock.unlock();

    }
    public static void main(String[] args){

        String s1 = new StringBuilder().append("hello").append(" world").toString();

        System.out.println(s1.intern() == s1);

        String s2 = new StringBuilder().append("<clinit>").toString();

        System.out.println(s2.intern() == s2);


//        TestMyLocks testMyLocks = new TestMyLocks();
//
//        ArrayList<String> lists = new ArrayList<>();
//
//        lists.add("hello lamda");
//
//        lists.forEach((o)->{
//            System.out.println(o);
//        });
//
//        for(int i = 0; i<100;i++){
//            Thread thread = new MyThread(testMyLocks);
//            thread.setName("Thread"+i);
//            thread.start();
//        }


    }


}
