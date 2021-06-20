package com.atguigu.java;
/*
*   类中属性的使用
*   属性(成员变量)  VS 局部变量
*   1 相同点:
*       1.1 定义变量的格式: 数据类型 变量名 = 变量值
*       1.2 先声明 后使用
*       1.3 变量都有其对应的作用域
*
*   2 不同点
*       2.1 在类中声明的位置的不同
*       属性: 直接定义在类的一对 {} 内
*       局部变量: 将声明在方法内、 方法形参、 代码块内、 构造器形参、 构造器内部的变量
*       2.2 关于权限修饰符的不同
*       属性: 可以在声明属性时, 指明其权限, 使用权限修饰符.
*       常用的权限修饰符: private public 缺省(默认) protected  ---> 封装性
*       局部变量: 不能使用权限修饰符
*       2.3 默认初始化值的情况
*       属性: 类的属性, 根据其类型, 都有默认初始化值
*       整形(byte short int long): 0
*       浮点型(float double): 0.0
*       字符型(char): 0 或 '\u0000'
*       布尔型(boolean): false
*       引用数据类型(类 数组 接口等): null
*       局部变量: 没有默认初始化值, 意味着, 我们在调用局部变量之前, 一定要显示赋值.特别的, 形参是调用的时候赋值
*       2.4 在内存中加载的位置:
*       属性: 加载到堆空间中(非static)
*       局部变量: 加载到栈空间中
* */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.isMale);
    }
}

class User {
    // 属性(成员变量)
    String name;
    int age;
    boolean isMale;

    public void talk(String language) { // language 形参
        System.out.println("我们使用" + language + "进行交流");
    }
    public void eat() {
        String food = "烙饼"; // 局部变量
        System.out.println("喜欢吃" + food);
    }
}

