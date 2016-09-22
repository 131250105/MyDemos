package com.collection;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Arrays;

/**
 * Created by zy118686 on 16/9/22.
 */
public class MultisetDemo {

    /**
     * multiset的一个应用场景,基本就是用于统计
     * 统计词频
     */
     public static Integer countWord(String word,String seperator,String countWord){
         Multiset<String>  countsSet = HashMultiset.create();
         String[] words = word.split(seperator);
         countsSet.addAll(Arrays.asList(words));
         return countsSet.count(countWord);
     }

    /**
     *Multiset主要方法
     Multiset接口定义的接口主要有：
     　　　　add(E element) :向其中添加单个元素
     　　　　add(E element,int occurrences) : 向其中添加指定个数的元素
     　　　　count(Object element) : 返回给定参数元素的个数
     　　　　remove(E element) : 移除一个元素，其count值 会响应减少
     　　　　remove(E element,int occurrences): 移除相应个数的元素
     　　　　elementSet() : 将不同的元素放入一个Set中
     　　　　entrySet(): 类似与Map.entrySet 返回Set<Multiset.Entry>。包含的Entry支持使用getElement()和getCount()
     　　　　setCount(E element ,int count): 设定某一个元素的重复次数
     　　　　setCount(E element,int oldCount,int newCount): 将符合原有重复个数的元素修改为新的重复次数
     　　　　retainAll(Collection c) : 保留出现在给定集合参数的所有的元素
     　　　　removeAll(Collectionc) : 去除出现给给定集合参数的所有的元素
     */

    /**
     *   对应关系
     * 　Map                  Corresponding Multiset      Supports null elements
     　　HashMap              HashMultiset                     Yes
     　　TreeMap              TreeMultiset                     Yes (if the comparator does)
     　　LinkedHashMap        LinkedHashMultiset               Yes
     　　ConcurrentHashMap    ConcurrentHashMultiset           No
     　　ImmutableMap         ImmutableMultiset                No
     */
}
