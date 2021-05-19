public class MethodDetail {
	public static void main(String[] args) {
		/*
			注意事项和使用细节
			访问修饰符(作用是控制 方法使用的范围)
			如果不写, 默认访问[有四种: public protected private 默认]
			
			调用方法 就会新建一个栈
			
			返回数据类型
			1 一个方法最多有一个返回值[如何返回多个结果? 返回数组]
			2 返回类型可以为任意类型, 包含基本类型或引用类型(数组, 对象)
			3 如果方法要求有返回数据, 则方法体中最后执行的语句必须为return 值, 而且要求返回值类型必须和
			  return 的值类型一致或兼容
			4 如果方法是 void, 则方法体中可以没有return语句, 或着只写 return 
			5 方法名 遵循驼峰命名法, getSum 这样
			6 形参列表可以有多个参数, 用逗号隔开

			7  同一个类中的方法, 可以直接调用

			8 跨类中的方法 A 类 调用 B 类方法, 需要通过对象名调用

		*/
	
	
		//同一个类中的方法, 可以直接调用
		A a = new A();
		a.sayOk();
	}
}

class A {
	public void print(int n) {
		System.out.println("n=" + n);
	}

	public void sayOk() {
		//同一个类中的方法, 可以直接调用
		print(10);
		System.out.print("sayOk");
	}

	public void kualei() {
		// 创建 B 对象. 然后在调用方法即可
		B b = New B();
		b.hi();
	}
}

class B {
	public void hi() {
		System.out.print("B类中的hi被执行");
	}
}