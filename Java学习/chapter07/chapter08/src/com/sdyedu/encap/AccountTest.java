package com.sdyedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        // 使用无参构造器
        Account account = new Account();
//        account.setName("lees");
//        account.setBalance(1020);
//        account.setPassword("999999");

        // 有参构造器
        Account accountTest = new Account("jack", 100, "123456");
        System.out.println(accountTest.info());
    }
}
