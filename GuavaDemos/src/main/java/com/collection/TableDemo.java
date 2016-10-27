package com.collection;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * Created by zy118686 on 16/9/22.
 */
public class TableDemo {

    /**
     * 其实就是模拟了一个表格,有行和列
     * 感觉可以取代二维数组
     */
    public static void TableTest(){
        Table<String,String,String> table = HashBasedTable.create();
        for (int i = 0; i<3 ; i++){
            for(int j = 0 ; j<3; j++){
                table.put(""+i,""+j,"hello"+i+""+j);
            }
        }

        System.out.println(table.row("1"));
        System.out.println(table.get("1","1"));
        System.out.println();
    }


}
