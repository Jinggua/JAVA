package com.sdyedu.override_;

public class Dog extends Animal{
    // Dog 是 Animal 子类, Dog中的 cry 方法 和 Animal 中的 cry 定义形式一样(名称 返回类型 参数),
    // 这时我们就说 Dog 的 cry 方法重写了 Animal 的 cry 方法
    public void cry() {
        System.out.println("小狗叫...");
    }
    //子类方法的返回类型和父类方法返回类型一样, 或者是父类返回类型的子类型, 如 父类是 Object 子类返回的是 String 也构成重写
    public String m1() {
        return null;
    }

//    public AAA m3() {
//        return null;
//    }
    public BBB m3() {
        return null;
    }


    // 和Animal中的eat 构成重写,
    // 子类方法不能缩小父类方法的的访问权限
    // 这个地方修饰符 不能写成别的 (protected等)
    // public > protected > 默认 > private
    public void eat() {

    }
}
class AAA {

}

class BBB extends AAA {

}
