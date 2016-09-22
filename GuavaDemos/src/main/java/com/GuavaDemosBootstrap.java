package com;

import com.cache.CallableCacheDemo;
import com.cache.LoadingCacheDemo;
import com.collection.MultisetDemo;

/**
 * Created by zy118686 on 16/9/20.
 */
public class GuavaDemosBootstrap {

    public static void main(String[] args){

        //测试callable缓存
//        CallableCacheDemo.testCallableCache();

        //测试MultiSet
        String strWorld="wer|dffd|ddsa|dfd|dreg|de|dr|ce|ghrt|cf|gt|ser|tg|ghrt|cf|gt|" +
                "ser|tg|gt|kldf|dfg|vcd|fg|gt|ls|lser|dfr|wer|dffd|ddsa|dfd|dreg|de|dr|" +
                "ce|ghrt|cf|gt|ser|tg|gt|kldf|dfg|vcd|fg|gt|ls|lser|dfr";
        System.out.println(MultisetDemo.countWord(strWorld,"\\|","de"));
    }
}
