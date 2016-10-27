package com.entity.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zy118686 on 16/9/21.
 */
@Target(ElementType.FIELD)
//Retention是必要的,不加注解就没用了
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {


}
