package com.entity.service;

import com.entity.annotation.NotNull;

import java.lang.reflect.Field;

/**
 * Created by zy118686 on 16/9/21.
 */
public class ValidateService {

    public static void explain(Object object) throws Exception{
        Class<? extends Object> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            validate(field,object);
            field.setAccessible(false);
        }
    }

    private static void validate(Field field,Object object) throws Exception{
        NotNull notNull = field.getAnnotation(NotNull.class);
        if(notNull==null){
            return ;
        }

        System.out.println(field.get(object));

        if(field.get(object)==null) {
            throw new NullPointerException();
        }
    }
}
