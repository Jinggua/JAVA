/*
	���������ǹ��췽��, �����Ƿ���, ����ͷ���һ��, ֻ��û�з���ֵ

	1 һ���� ���Զ�������ͬ�Ĺ�����, ������������
	2 ����������Ҫ��������ͬ
	3 ������û�з���ֵ
	4 ����������ɶ���ĳ�ʼ��, �����Ǵ�������
	5 �ڴ�������ʱ, ϵͳ�Զ��ĵ��ø���Ĺ��췽��(������)
	6 һ���������Լ��Ĺ�����, Ĭ�Ϲ������͸�����, �Ͳ�����ʹ��Ĭ���޲ι�������, ������ʾ�Ķ���һ��
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
	int age; // Ĭ��0
	// ������
	// ������ ���ܺ���������ͬ, pname, page ������ name �� age ��������
	public Person(String pname, int page) {
		name = pname;
		age = page;
	}
	// �ڶ���������
	public Person(String pname) {
		name = pname;
	}
}

class Dog {
	// Ĭ�Ϲ�����
	// Dog() {

	// }
	public Dog(String name) {
		System.out.println("name =" + name);
	}

	// ��ʾ�Ķ���, ������Ḳ��
	Dog() {
		System.out.println("123");
	}

}