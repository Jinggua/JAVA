package com.sdyedu.encap;

/*
*  创建程序, 在其中定义两个类: Account 和 AccountTest类体会Java的封装性
*  Account类要求具有属性长度(2-4位) 余额(必须> 20)
*  密码(必须是六位), 如果不满足, 则给出提示信息, 并给默认值(自己定)
*  通过setXXX方法给Account的属性赋值
*  在AccountTest中测试
* */

public class Account {
    // 为了封装,将3个属性设置为 private, 不让别人改
    private String name;
    private double balance;
    private String password;

    // 提供两个构造器
    public Account() { // 无参构造器
    }

    // 构造器和setter结合做限制
    public Account(String name, double balance, String password) { // 有参构造器
       // 在构造器中直接调用setter, 也可以实例化后再调用
        this.setName(name);
       this.setBalance(balance);
       this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >=2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字长度不正确");
            this.name = "lee";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20");
            this.balance = 0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码长度必须为6位");
            this.password = "000000";
        }
    }

    public String info() {
        return "信息: name="  + this.name + "\t" + "balance=" + this.balance + "\t" +"password=" + this.password;
    }
}
