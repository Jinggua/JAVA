public class This01 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("���", 5);
		System.out.println("dog1��hashCode=" + dog1.hashCode());
		dog1.info();
	}
}

class Dog {
	String name;
	int age;

	/*
		������
		������ǹ��������β�, �ܹ�ֱ��д��������, �͸�����
		���ǳ�����һ������, ���ݱ�����������ԭ��
		�������� name ���Ǿֲ�����, ����������
		�������� age ���Ǿֲ�����, ����������
	 	�������� this �ؼ���
	 	ÿ��������һ��this����, ָ����
		�򵥵�˵, �ĸ��������, this �ʹ����ĸ�����
	*/
	/*
		public Dog(String name, int age) {
			name = name;  //������name�����β�, ������ûɶӰ��
			age = age;
			System.out.println("�����������" + name + "\t" + age + "\t");
		}
	*/
	public Dog(String name, int age) {
		this.name = name;  // this.name ���ǵ�ǰ��������� name
		this.age = age;    // this.age ���ǵ�ǰ��������� age
		// System.out.println("�����������" + name + "\t" + age + "\t");
		System.out.println("�������е�this.hashCode= " + this.hashCode());
	}
	public void info() { // ��Ա����, ��������������Ϣ
		System.out.println("info�е�this.hashCode= " + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}