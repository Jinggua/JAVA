public class VarScope {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.hi();
	}
}
class Cat {
	// ȫ�ֱ���: Ҳ��������, ������Ϊ�������� Cat��: cry eat �ȷ���ʹ������
	int age = 10;  // ����ʱ, ����ֱ�Ӹ�ֵ

	double weight;  // û��ֵ, ��Ĭ��ֵ 0.0
	public void cry() {
		// n �� name ���Ǿֲ�����
		// n �� name ���������� cry ������
		int n = 10;
		String name = "sss";
		System.out.println("age=" + age);
	}

	public void eat() {
		System.out.println("age=" + age);
	}

	public void hi() {
		int num; // �ֲ�����û�и�ֵ, �޷�ʹ��, ��Ϊû��Ĭ��ֵ, ��ʹ�ò��ᱨ��
		// System.out.println(num);
		System.out.println("weight=" + weight);
	}
}
