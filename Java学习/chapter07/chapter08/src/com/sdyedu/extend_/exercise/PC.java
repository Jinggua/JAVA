package com.sdyedu.extend_.exercise;

public class PC extends Computer{
    private String brand;

    // 这里体现出: 父类的构造器完成父类属性初始化, 子类的构造器完成子类的初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo() {
        System.out.println(this.getDetails() + "brand=" + this.brand);
    }
}
