public class MethodDetail {
	public static void main(String[] args) {
		/*
			ע�������ʹ��ϸ��
			�������η�(�����ǿ��� ����ʹ�õķ�Χ)
			�����д, Ĭ�Ϸ���[������: public protected private Ĭ��]
			
			���÷��� �ͻ��½�һ��ջ
			
			������������
			1 һ�����������һ������ֵ[��η��ض�����? ��������]
			2 �������Ϳ���Ϊ��������, �����������ͻ���������(����, ����)
			3 �������Ҫ���з�������, �򷽷��������ִ�е�������Ϊreturn ֵ, ����Ҫ�󷵻�ֵ���ͱ����
			  return ��ֵ����һ�»����
			4 ��������� void, �򷽷����п���û��return���, ����ֻд return 
			5 ������ ��ѭ�շ�������, getSum ����
			6 �β��б�����ж������, �ö��Ÿ���

			7  ͬһ�����еķ���, ����ֱ�ӵ���

			8 �����еķ��� A �� ���� B �෽��, ��Ҫͨ������������

		*/
	
	
		//ͬһ�����еķ���, ����ֱ�ӵ���
		A a = new A();
		a.sayOk();
	}
}

class A {
	public void print(int n) {
		System.out.println("n=" + n);
	}

	public void sayOk() {
		//ͬһ�����еķ���, ����ֱ�ӵ���
		print(10);
		System.out.print("sayOk");
	}

	public void kualei() {
		// ���� B ����. Ȼ���ڵ��÷�������
		B b = New B();
		b.hi();
	}
}

class B {
	public void hi() {
		System.out.print("B���е�hi��ִ��");
	}
}