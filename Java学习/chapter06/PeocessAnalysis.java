/*
	流程: 
	1 当执行 Person p = new Person("小倩", 20) 时, 先在栈中创建一个对象p的引用(里面存的是地址), 指向堆中的一个地址, 同时在方法区加在Person 类信息(只会加载一次), 真正的对象在堆中
	2 在堆里面开空间, 一个存放 age 一个存放 name, 开辟空间时候, 里面存放的是默认值, age 默认值是 0, 然后在
	  显示初始化, 初始化值为 90. 
	3 当初始化过后之后, 在进行构造器的处理
	4 对象的地址返回给对象的引用 p
*/
public class PeocessAnalysis {
	public static void main(String[] args) {
		Person p = new Person("小倩", 20);
	}
}

class Person {
	int age = 90; // 默认值是 0
	String name;
	Person(String n, int a) {
		name = n;
		age = a;
	} 
}