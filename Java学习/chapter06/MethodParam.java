public class MethodParam {
	public static void main(String[] args) {
		/*
			参数的传递: 
			1 基本类型是的值传递
			2 引用类型传递的是地址
		*/
		int [] arr = {1, 2, 3};
		B b = new B();
		b.test100(arr);
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// B类中编写一个方法 test200, 可以接收 一个 Person(name, age) 对象, 在方法中修改该对象的属性,看看原来的对象是否变化
		// 测试
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		System.out.print("原age=" + p.age);
		b.test200(p);
		System.out.print("age=" + p.age);
	}
}


class Person {
	String name;
	int age;
}

class B {
	// 测试数组
	public void test100(int[] arr) {
		arr[0] = 200;
	}

	// 测试对象
	public void test200(Person p) {
		p.age = 40;
	}
}