package com.sdyedu.pkg;

import com.sdyedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 不同的包, 只能访问 public 修饰的属性或方法
        System.out.println(a.n1);

    }
}
