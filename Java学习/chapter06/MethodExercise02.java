public class MethodExercise02 {
	public static void main(String[] args) {
		/*
			��дһ������ copyPerson, ���Ը���һ�� Person ����, ���ظ��ƵĶ���, ��¡����, ע��Ҫ��õ��¶����Ҳ���Ķ��������������Ķ���
			ֻ�����ǵ�������ͬ
		*/
		Person p = new Person();
		p.name = "jack";
		p.age = 30;
		// ����һ��tools����
		myTools tools = new myTools();
		Person p2 = tools.copyPerson(p);
		// ���� p �� p2 ������������, ������ͬ
		System.out.println("p������ age = " + p.age + "name = " + p.name);
		System.out.println("p2������ age = " + p2.age + "name = " + p2.name);
		p.name = "ppp";
		//��ʱ����Ϊʲô ����, �ַ�����Ӧ���ڳ���������
		System.out.println("p��name = " + p.name);  // ppp
		System.out.println("p2��name = " + p2.name);  /// jack
	}
}

class Person {
	String name;
	int age;
}

// ��дһ������ copyPerson, ���Ը���һ�� Person ����, ���ظ��ƵĶ���,
class myTools {
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}