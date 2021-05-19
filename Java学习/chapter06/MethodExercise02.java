public class MethodExercise02 {
	public static void main(String[] args) {
		/*
			编写一个方法 copyPerson, 可以复制一个 Person 对象, 返回复制的对象, 克隆对象, 注意要求得到新对象和也来的对象是两个独立的对象
			只是他们的属性相同
		*/
		Person p = new Person();
		p.name = "jack";
		p.age = 30;
		// 创建一个tools对象
		myTools tools = new myTools();
		Person p2 = tools.copyPerson(p);
		// 到此 p 和 p2 就是两个对象, 属性相同
		System.out.println("p的属性 age = " + p.age + "name = " + p.name);
		System.out.println("p2的属性 age = " + p2.age + "name = " + p2.name);
		p.name = "ppp";
		//暂时不懂为什么 困惑, 字符串不应该在常量池里吗
		System.out.println("p的name = " + p.name);  // ppp
		System.out.println("p2的name = " + p2.name);  /// jack
	}
}

class Person {
	String name;
	int age;
}

// 编写一个方法 copyPerson, 可以复制一个 Person 对象, 返回复制的对象,
class myTools {
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}