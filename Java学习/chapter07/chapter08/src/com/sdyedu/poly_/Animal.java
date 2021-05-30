package com.sdyedu.poly_;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 方法会继承给子类
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
