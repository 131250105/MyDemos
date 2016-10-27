package com.concurrent;

/**
 * Created by zy118686 on 16/10/21.
 */
public class MyThread extends Thread{


    private TestMyLocks testMyLocks;

    public MyThread(){}

    public MyThread(TestMyLocks testMyLocks){
        this.testMyLocks  = testMyLocks;
    }

    @Override
    public void run(){
        testMyLocks.testSimpleSpinLock();
        System.out.println(testMyLocks.num);
    }
}
