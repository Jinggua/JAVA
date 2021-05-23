public class This01 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("大黑", 5);
		System.out.println("dog1的hashCode=" + dog1.hashCode());
		dog1.info();
	}
}

class Dog {
	String name;
	int age;

	/*
		构造器
		如果我们构造器的形参, 能够直接写成属性名, 就更好了
		但是出现了一个问题, 根据变量的作用域原则
		构造器的 name 就是局部变量, 而不是属性
		构造器的 age 就是局部变量, 而不是属性
	 	所以引出 this 关键字
	 	每个对象都有一个this属性, 指向本身
		简单的说, 哪个对象调用, this 就代表哪个对象
	*/
	/*
		public Dog(String name, int age) {
			name = name;  //这两个name都是形参, 对属性没啥影响
			age = age;
			System.out.println("构造器里面的" + name + "\t" + age + "\t");
		}
	*/
	public Dog(String name, int age) {
		this.name = name;  // this.name 就是当前对象的属性 name
		this.age = age;    // this.age 就是当前对象的属性 age
		// System.out.println("构造器里面的" + name + "\t" + age + "\t");
		System.out.println("构造器中的this.hashCode= " + this.hashCode());
	}
	public void info() { // 成员方法, 输出对象的属性信息
		System.out.println("info中的this.hashCode= " + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}