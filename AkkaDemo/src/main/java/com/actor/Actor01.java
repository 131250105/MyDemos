package com.actor;

import akka.actor.UntypedActor;

/**
 * Created by zy118686 on 16/9/21.
 */
public class Actor01 extends UntypedActor{
    public void onReceive(Object o) throws Exception {
        if(o instanceof String)
            System.out.println("actor01111"+o);
    }
}
