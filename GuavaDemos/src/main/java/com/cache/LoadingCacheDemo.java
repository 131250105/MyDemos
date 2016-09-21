package com.cache;

import com.google.common.cache.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by zy118686 on 16/9/20.
 */
public class LoadingCacheDemo {

    /**
     ImmutableMap<K, V> getAllPresent(Iterable<?> keys) 一次获得多个键的缓存值
     put和putAll方法向缓存中添加一个或者多个缓存项
     invalidate 和 invalidateAll方法从缓存中移除缓存项
     asMap()方法获得缓存数据的ConcurrentMap<K, V>快照
     cleanUp()清空缓存
     refresh(Key) 刷新缓存，即重新取缓存数据，更新缓存
     */

    public static void testLoadingCache(){
        LoadingCache<String , String > loadingCache = CacheBuilder.newBuilder()
                //设置可以同时进行写操作的线程数量
                .concurrencyLevel(8)
                //设置缓存写入后多久过期
                .expireAfterWrite(10, TimeUnit.SECONDS)
                //设置缓存被使用过后多久过期
                .expireAfterAccess(10,TimeUnit.SECONDS)
                //设置缓存最大容量为100，超过100之后就会按照LRU最近虽少使用算法来移除缓存项
                .initialCapacity(1000)
                //设置要统计缓存的命中率
                .recordStats()
                //设置当缓存值被移除时的提醒动作
                .removalListener(new RemovalListener<String, String>() {
                    @Override
                    public void onRemoval(RemovalNotification<String, String> notification) {
                        System.out.println(notification.getKey() + " was removed, cause is " + notification.getCause());
                    }
                })
                .build(new CacheLoader<String, String>() {
            @Override
            public String load(String s) throws Exception {
                return s+"load";
            }
        });

        try {
            System.out.println(loadingCache.get("hello"));
            loadingCache.put("hello","hello");
            System.out.println(loadingCache.get("hello"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
