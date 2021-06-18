package com.sdyedu.pkg;
/*
    语法: import 包
    我们引入一个包的主要目的是要使用该包下的类
* */

import java.util.Arrays;
// import java.util.Scanner; // 表示只会引入 java.util包下的 Scanner
// import java.util.*; // 表示将 java.util包下的所有类都引入
public class Import01 {
    public static void main(String[] args) {
        // 使用系统提供的 Arrays 完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        // 比如对其排序, 传统方法是自己写(冒泡)
        // 系统提供了相关的类, 可以方便完成排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
