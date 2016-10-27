package com;

import com.entity.service.ValidateService;
import com.entity.test.TestEntity;

/**
 * Created by zy118686 on 16/9/21.
 */
public class AnnotationDemoRun {

    public static void main(String[] args){
        try {
            TestEntity testEntity = new TestEntity();
            ValidateService.explain(testEntity);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
