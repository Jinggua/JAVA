public class VarScope {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.hi();
	}
}
class Cat {
	// 全局变量: 也就是属性, 作用域为整个类体 Cat类: cry eat 等方法使用属性
	int age = 10;  // 定义时, 可以直接赋值

	double weight;  // 没赋值, 有默认值 0.0
	public void cry() {
		// n 和 name 就是局部变量
		// n 和 name 的作用域在 cry 方法中
		int n = 10;
		String name = "sss";
		System.out.println("age=" + age);
	}

	public void eat() {
		System.out.println("age=" + age);
	}

	public void hi() {
		int num; // 局部变量没有赋值, 无法使用, 因为没有默认值, 不使用不会报错
		// System.out.println(num);
		System.out.println("weight=" + weight);
	}
}
