/*
	this的注意事项和使用细节
	1 this关键字可以用来访问本类的属性 方法 构造器
	2 this用于区分当前类的属性和局部变量
	3 访问成员方法的语法: this.方法名(参数列表)
	4 访问构造器语法: this(参数列表), 只能在构造器中使用, 即只能在构造器中访问另一个构造器
	  访问构造器的语法必须放在第一条语句
	5 this不能在类定义的外部使用, 只能在类定义的方法中使用
*/
public class ThisDetail {
	public static void main(String[] args) {
		
		// 方法
		T t1 = new T();
		t1.f2();

		// 构造器
		T t2 = new T();

	}
}


class T{
	/*
		访问构造器的语法: this(参数列表);
		只能在构造器中使用, 即只能在构造器中访问另一个构造器
		访问构造器的语法必须放在第一条语句
	*/

	// 调用构造器	
	public T() {
		// 访问构造器的语法必须放在第一条语句
		this("jack", 100);
		System.out.println("T() 构造器...");
	}

	public T(String name, int age) {
		System.out.println("T(String name, int age) 构造器...");
	}
	// 调用方法
	public void f1() {
		System.out.println("调用f1方法");		
	}

	public void f2() {
		System.out.println("调用f2方法");
		// 调用本类的 f1, 这两种是有区别的
		// 第一种方式
		f1();		
		// 第二种方式
		this.f1();
	}

	public void f2() {
		//区别: 传统方式, 就近原则, 使用this, 就是访问属性
		String name = "smith";
		// 传统方式
		System.out.println("name=" + name + "age=" + age);
		// 也可以访问this访问属性
		System.out.println("name=" + this.name + "age=" + this.age);
	}
}