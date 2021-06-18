package com.sdyedu.super_;

public class B extends A {

    // 访问父类的属性, 但不能访问父类的private属性
    public void hi() {
        System.out.println(super.n1 + super.n2 + super.n3 );
    }
    // 访问父类的方法, 不能访问 父类的private方法, super.方法名(参数列表)
    public void say() {
        super.test100();
        super.test200();
        super.test300();
    }
    // 访问父类的构造器: super(参数列表), 只能放在构造器的第一句, 只能出现一句

    public B() {
        super();
    }
}
