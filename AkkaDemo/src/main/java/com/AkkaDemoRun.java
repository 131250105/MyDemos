package com;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.actor.Actor01;
import com.actor.Actor02;

/**
 * Created by zy118686 on 16/9/21.
 */
public class AkkaDemoRun {

    public static void main(String[] args){
        ActorSystem system = ActorSystem.create("demo");
        ActorRef actor1 = system.actorOf(Props.create(Actor01.class));
        ActorRef actor2 = system.actorOf(Props.create(Actor02.class));
        actor1.tell("hello",actor2);
        system.shutdown();
    }

}
