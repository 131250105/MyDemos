package com.actor;

import akka.actor.UntypedActor;

/**
 * Created by zy118686 on 16/9/21.
 */
public class Actor02 extends UntypedActor{

    @Override
    public void onReceive(Object o) throws Exception {
        if(o instanceof String )
            System.out.println("actor02"+o);
    }
}
