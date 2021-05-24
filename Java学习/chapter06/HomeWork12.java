public class HomeWork12 {
	public static void main(String[] args) {
		
	}
}

/*
	创建一个 Employee 类, 属性有(名字, 性别, 年龄, 职位, 薪水), 提供3个构造方法, 可以初始化
	1 名字, 性别, 年龄, 职位, 薪水
	2 名字, 性别, 年龄
	3 职位, 薪水
	4 要求尽量复用构造器
*/
class Employee {
	String name;
	char gender;
	int age;
	String job;
	double sal;

	// 因为要求尽量复用构造器, 因此先写少的构造器
	public Employee(String job, double sal) {
		this.job = job;
		this.sal = sal;
	}

	public Employee(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String job, double sal, String name, char gender, int age) {
		this(name, gender, age); // 使用前面的构造器
		this.job = job;
		this.sal = sal;
	}
}