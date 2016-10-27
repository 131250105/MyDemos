package com.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by zy118686 on 16/10/21.
 * 最简单的自旋锁
 * 非公平锁
 */
public class SimpleSpinLock {

    private AtomicReference<Thread> owner = new AtomicReference<Thread>();

    public void lock(){
        Thread currentThread = Thread.currentThread();

        while(!owner.compareAndSet(null,currentThread)){

        }
    }

    public void unlock(){
        Thread currentThread = Thread.currentThread();

        owner.compareAndSet(currentThread,null);
    }
}
