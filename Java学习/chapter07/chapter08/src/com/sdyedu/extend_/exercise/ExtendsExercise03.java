package com.sdyedu.extend_.exercise;

/*
*   编写 Computer 类, 包含 CPU, 内存, 硬盘等属性, getDetail方法用于返回Computer的详细信息
*   编写 PC 子类, 继承Computer类, 添加特有属性[品牌 brand ]
*   编写 NotePad 子类, 继承 Computer 类, 添加特有属性[color]
*   编写 Computer 类, 在 main 方法中创建 PC 和 NotePad 对象, 分别给对象中特有的属性赋值,
*   以及从 Computer 类继承的属性赋值, 并使用方法打印输出信息
* */
public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 512, "IBM");
        pc.printInfo();
    }
}
