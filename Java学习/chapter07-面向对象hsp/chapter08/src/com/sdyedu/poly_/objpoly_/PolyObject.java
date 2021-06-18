package com.sdyedu.poly_.objpoly_;
/*
*   1 一个对象的编译类型和运行类型可以不一致
*   2 编译类型在定义对象时, 就确定了, 不能改变
*   3 运行类型是可以变化的
*   4 编译类型看定义时 = 号的左边, 运行类型看右边
* */
public class PolyObject {
    public static void main(String[] args) {
        // 体验对象多态特点

        // animal 编译类型就是 Animal, 运行类型是 Dog
        Animal animal = new Dog();
        animal.cry(); // 因为运行时, 执行到该行时, animal 运行类型是Dog,所以 cry 就是 Dog 的 cry

        // animal 编译类型 Animal, 运行类型就是 Cat
        animal = new Cat();
        animal.cry();
    }
}
