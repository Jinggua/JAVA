package com.sdyedu.modifier;

public class B {
    public void say() {
        // 在同一个包下, 可以访问 public, protected 和 默认修饰的属性或方法, 不能访问 private 属性或方法
        A a = new A();
        System.out.println("n1=" + a.n1 + "n2=" + a.n2 + "n3=" + a.n3);
    }
}
