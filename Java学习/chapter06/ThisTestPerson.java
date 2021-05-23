public class ThisTestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("mary", 20);
		Person p2 = new Person("jack", 20);
		System.out.println(p1.compareTo(p2));
	}
}

/*
	���� Person ��, ������name age ����, ���ṩ compareTo�ȽϷ���, �����ж��Ƿ����һ�������
	�ṩ������ TestPerson ���ڲ���, ���ֺ�������ȫһ��, �ͷ��� true, ���򷵻� false
*/
class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public boolean compareTo(Person p) {
		// �ַ����Ƚ��� equals
		// if (this.name.equals(p.name) && this.age == p.age) {
		// 	return true;
		// } else {
		// 	return false;
		// }

		// ��
		return this.name.equals(p.name) && this.age == p.age
	}
}
