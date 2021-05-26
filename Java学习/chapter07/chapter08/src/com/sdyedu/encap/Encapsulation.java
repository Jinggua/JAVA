package com.sdyedu.encap;

/*
    不能随便查看人的年龄, 工资等隐私, 并对设置的年龄进行合理的验证,年龄合理就设置,否则给默认,年龄必须在1 - 120
    工资不能直接查看, name 长度在 2 - 6 字符之间
* */
public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "jack";
        // age 私有化, 不能这样赋值
        // person.age = 100;

        person.setName("jack11");
        person.setAge(300);
        person.setSalary(30000);
        System.out.println(person.info());
        // 私有化的属性无法这么访问, 只能通过 getter 访问
        //System.out.println(person.salary);

        // 如果我们自己使用构造器指定属性, 会把限制绕过去, 这时候我们可以把 setter 在构造器中调用, 这样就限制住了
        Person smith = new Person("smith", 2000, 50000);
        System.out.println("============smith的信息==============");
        System.out.println(smith.info()); // 信息为name=smith age=18 薪水50000.0
    }
}

class Person {
    public String name; // name 公开
    private int age; // age 私有化
    private double salary; // 私有化
    // 自己手写太慢
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName(String name) {
//        return this.name;
//    }


    public Person() {
    }
    // 有三个属性的构造器
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        // 调用 setter
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    // alt + insert  Getter and Setter, 自动创建模板
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 给个限制
        if (name.length() >= 2 && name.length() <=6) {
            this.name = name;
        } else {
            System.out.println("名字长度不打");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 判断
        if (age >=1 && age <=120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1 - 120");
            this.age = 18; // 设置一个默认年龄
        }
    }

    public double getSalary() {
        // 可以在这里是增加对当前对象的权限的判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 写一个方法, 返回属性信息
    public String info() {
        return "信息为name=" + name + "age=" + age + "薪水" + salary;
    }
}
