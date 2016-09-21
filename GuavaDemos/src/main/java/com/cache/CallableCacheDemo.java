package com.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.Callable;

/**
 * Created by zy118686 on 16/9/20.
 */
public class CallableCacheDemo {

    /**
     * 暂时还没想到这个callabale方式有什么应用场景
     */
    public static void testCallableCache(){
        Cache<String,String> cache = CacheBuilder.newBuilder().maximumSize(1000).build();
        try {
            String val = cache.get("hello", new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "helloworld";
                }
            });

            System.out.println(val);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
