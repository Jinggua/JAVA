package com.sdyedu.poly_.Detail_;

/*
*   instanceof 比较操作符, 用于判断对象的  运行类型  是否为xx类型或xx类型的子类型
* */
public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB); // true
        System.out.println(bb instanceof AA); // true

        // aa 编译类型是 AA, 运行类型是 BB
        AA aa = new BB();
        System.out.println(aa instanceof AA); // true
        System.out.println(bb instanceof BB); // true
    }
}

class AA { // 父类

}

class BB extends AA { // 子类

}
