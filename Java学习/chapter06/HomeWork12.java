public class HomeWork12 {
	public static void main(String[] args) {
		
	}
}

/*
	����һ�� Employee ��, ������(����, �Ա�, ����, ְλ, нˮ), �ṩ3�����췽��, ���Գ�ʼ��
	1 ����, �Ա�, ����, ְλ, нˮ
	2 ����, �Ա�, ����
	3 ְλ, нˮ
	4 Ҫ�������ù�����
*/
class Employee {
	String name;
	char gender;
	int age;
	String job;
	double sal;

	// ��ΪҪ�������ù�����, �����д�ٵĹ�����
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
		this(name, gender, age); // ʹ��ǰ��Ĺ�����
		this.job = job;
		this.sal = sal;
	}
}