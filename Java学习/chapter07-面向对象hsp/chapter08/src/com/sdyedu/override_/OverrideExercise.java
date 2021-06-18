package com.sdyedu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack", 10);
        System.out.println(person.say());
        Student rose = new Student("rose", 20, "110", 100);
        System.out.println(rose.say());
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {
        System.out.println("我被调用了");
        return "name" + this.name + "age" + this.age;
    }
}

class Student extends Person {
    public String id;
    private int score;

    public Student(String name, int age, String id, int score) {
        super(name, age); // 这里会自动调用父类的构造器
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String say() {
        return "name" + getName() + "age=" + getAge() + "id=" + id + "score" + score;
//        return super.say() + "id=" + id + "score" + score;
    }
}

