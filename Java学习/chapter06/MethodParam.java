public class MethodParam {
	public static void main(String[] args) {
		/*
			�����Ĵ���: 
			1 ���������ǵ�ֵ����
			2 �������ʹ��ݵ��ǵ�ַ
		*/
		int [] arr = {1, 2, 3};
		B b = new B();
		b.test100(arr);
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// B���б�дһ������ test200, ���Խ��� һ�� Person(name, age) ����, �ڷ������޸ĸö��������,����ԭ���Ķ����Ƿ�仯
		// ����
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		System.out.print("ԭage=" + p.age);
		b.test200(p);
		System.out.print("age=" + p.age);
	}
}


class Person {
	String name;
	int age;
}

class B {
	// ��������
	public void test100(int[] arr) {
		arr[0] = 200;
	}

	// ���Զ���
	public void test200(Person p) {
		p.age = 40;
	}
}