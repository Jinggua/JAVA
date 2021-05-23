public class ConstructorExercise {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("sdy", 18);
	}
}

/*
	在 Person 类中添加两个构造器:
	第一个无参构造器: 利用构造器设置所有人的age属性初始值为18
	第二个带pName 和 Page两个参数的构造器, 使得每次创建Person对象的同时初始化对象的age属性值和name属性值
	分别使用不同的构造器创建对象
*/
class Person {
	String name; // 默认值 null
	int age; // 默认值 0
	// 第一个无参构造器: 利用构造器设置所有人的age属性初始值为18
	public Person() {
		age = 18; // 不用通过传参, 直接写死
	}

	// 第二个带pName 和 Page两个参数的构造器, 使得每次创建Person对象的同时初始化对象的age属性值和name属性值
	public Person(String pname, int page) {
		name = pname;
		age = page;
	}
}