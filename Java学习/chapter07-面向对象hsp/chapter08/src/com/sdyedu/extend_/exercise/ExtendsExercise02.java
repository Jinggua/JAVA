package com.sdyedu.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        CC cc = new CC();
    }
}
// 我是A类
// hello 我是BB类的有参构造器
// "我是c类有参构造器"
// 我是c类无参构造器
class AA {
    public AA() {
        System.out.println("我是A类");
    }
}

class BB extends AA { // BB 继承 AA
    public BB() {
        System.out.println("我是BB类的无参构造器");
    }
    public BB(String name) {
        System.out.println(name + "我是BB类的有参构造器");
    }
}
class CC extends BB { // CC 类 继承 BB

    public CC() {
        this("hello");
        System.out.println("我是c类无参构造器");
    }
    public CC(String name) {
        super("hahah");
        System.out.println("我是c类有参构造器");
    }
}