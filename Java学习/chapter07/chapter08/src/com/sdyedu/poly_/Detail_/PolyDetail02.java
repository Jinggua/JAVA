package com.sdyedu.poly_.Detail_;

import com.sdyedu.extend_.Sub;

/*
*   属性没有重写之说, 属性的值看编译类型
* */
public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub1(); // 向上转型
        System.out.println(base.count); // 10, 看 base 的编译类型
        Sub1 sub1 = new Sub1();
        System.out.println(sub1); // 20 sub1 的编译类型是 Sub1
    }
}

class Base {
    int count = 10; // 属性
}

class Sub1 extends Base {
    int count = 20;
}
