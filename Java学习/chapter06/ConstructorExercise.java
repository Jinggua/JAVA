public class ConstructorExercise {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("sdy", 18);
	}
}

/*
	�� Person �����������������:
	��һ���޲ι�����: ���ù��������������˵�age���Գ�ʼֵΪ18
	�ڶ�����pName �� Page���������Ĺ�����, ʹ��ÿ�δ���Person�����ͬʱ��ʼ�������age����ֵ��name����ֵ
	�ֱ�ʹ�ò�ͬ�Ĺ�������������
*/
class Person {
	String name; // Ĭ��ֵ null
	int age; // Ĭ��ֵ 0
	// ��һ���޲ι�����: ���ù��������������˵�age���Գ�ʼֵΪ18
	public Person() {
		age = 18; // ����ͨ������, ֱ��д��
	}

	// �ڶ�����pName �� Page���������Ĺ�����, ʹ��ÿ�δ���Person�����ͬʱ��ʼ�������age����ֵ��name����ֵ
	public Person(String pname, int page) {
		name = pname;
		age = page;
	}
}