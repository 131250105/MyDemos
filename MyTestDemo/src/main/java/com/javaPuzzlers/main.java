package com.javaPuzzlers;

/**
 * Created by zy118686 on 16/10/31.
 *

 1.窄型转换成较宽的整型时的符号扩展行为:如果最初的数值类型是有符号的,那么
 就执行符号扩展;如果它是 char,那么不管它将要被转换成什么类型,都执行
 零扩展

 2.在单个的表达式中不要对相同的变量赋值两次,因为后来的赋值在后面的计算中不可见

 3.问号表达式的规则
 • 如果第二个和第三个操作数具有相同的类型,那么它就是条件表达式的类型。换句话说,你可以通过绕过混合类型的计算来避免大麻烦。
 • 如果一个操作数的类型是 T,T 表示 byte、short 或 char,而另一个操作 数是一个 int 类型的常量表达式,它的值是可以用类型 T 表示的,那么条 件表达式的类型就是 T。
 • 否则,将对操作数类型运用二进制数字提升,而条件表达式的类型就是第 二个和第三个操作数被提升之后的类型。

 4.
 复合赋值 E1 op= E2 等价于简单赋值 E1 =
 (T)((E1)op(E2)),其中 T 是 E1 的类型,除非 E1 只被计算一次。
 */
public class main {

    public static void main(String[] args){

        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        System.out. println(pig == dog);
    }
}


