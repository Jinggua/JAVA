package com.sdyedu.extend_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A {
    A() {
        System.out.println("a");

    }
    A(String name) {
        System.out.println("a name");
    }
}
class B extends  A {
    B() {
        this("abc"); // 这里没有默认的 super(), 因为 this 和 super 不共存
        System.out.println("b");
    }
    B(String name) {
        // 这里有默认的 super()
        System.out.println("b name");
    }
}
