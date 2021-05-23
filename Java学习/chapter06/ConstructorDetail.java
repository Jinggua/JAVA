/*
	构造器就是构造方法, 本质是方法, 定义和方法一样, 只是没有返回值

	1 一个类 可以定义多个不同的构造器, 即构造器重载
	2 构造器名字要和类名相同
	3 构造器没有返回值
	4 构造器是完成对象的初始化, 并不是创建对象
	5 在创建对象时, 系统自动的调用该类的构造方法(构造器)
	6 一旦定义了自己的构造器, 默认构造器就覆盖了, 就不能在使用默认无参构造器了, 除非显示的定义一下
*/
public class ConstructorDetail {
	public static void main(String[] args) {
		Person person1 = new Person("king", 40);
		Person person2 = new Person("jack");
		System.out.println("p1name = " + person1.name + "p1age" + person1.age);  // king 40
		System.out.println("p2name = " + person2.name + "p2age" + person2.age);  // jack 0 
		Dog dog = new Dog();

	}
}

class Person {
	String name;
	int age; // 默认0
	// 构造器
	// 参数名 不能和属性名相同, pname, page 不能用 name 和 age 做参数名
	public Person(String pname, int page) {
		name = pname;
		age = page;
	}
	// 第二个构造器
	public Person(String pname) {
		name = pname;
	}
}

class Dog {
	// 默认构造器
	// Dog() {

	// }
	public Dog(String name) {
		System.out.println("name =" + name);
	}

	// 显示的定义, 这个不会覆盖
	Dog() {
		System.out.println("123");
	}

}