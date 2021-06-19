package com.atguigu.java;

/*
*   设计类, 其实就是设计类的成员
*
*   二 类和对象的使用:
*   1 创建类, 设计类的成员
*   2 创建类的对象
*   3 通过对象.属性 或 对象.方法调用对象的结构
*
*   三 如果创建了一个类的多个对象, 则每个对象都独立的拥有一套类的属性(非static的)
*   意味着: 如果我们一个对象的属性a, 则不会影响另外一个对象的属性a.
*
*
*   方法中定义的变量都是局部变量(包含main方法)
*   栈: 先进后出
*   堆: 只要 new 的对象都在堆中
* */
public class PersonTest {
    public static void main(String[] args) {
        // 创建 Person 类的对象
        Person person = new Person();
        // 调用对象的结构: 属性 方法
        person.name = "tom"; // 赋值
        System.out.println(person.name); // 调用属性的值
    }
}

class Person {
    // 成员包含 属性 和 方法
    // 属性(field) 对应类中的成员变量
    // 行为(method): 对应类中的成员方法

    // 属性
    String name; // 默认值是 null
    int age = 1;
    boolean isMale; // 默认是 false

    // 方法
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
    public void talk(String language) {
        System.out.println("说话 使用的是" + language);
    }
}
