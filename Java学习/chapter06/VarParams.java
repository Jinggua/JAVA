public class VarParams {
	public static void main(String[] args) {
		Method m = new Method();
		System.out.print("��Ϊ: " + m.sum2(10, 20));
		System.out.print("��Ϊ: " + m.sum2(100, 200));

		int[] arr = {1, 2, 3, 4};
		System.out.print("�����Ϊ: " + m.sum2(arr));
	}
}

class Method {
	// ���� 2 �����ĺ� 3 �����ĺ� 4 ..5 .. �����ĺ�
	
	// ���صķ�����
	// ȱ��: �鷳
	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	public int sum(int n1, int n2, int n3, int n4) {
		return n1 + n2 + n3 + n4;
	}


	// �������������������ͬ, ������ͬ, ֻ�ǲ���������ͬ, ����ʹ�ÿɱ����
	// �ɱ����
	// 1 int... ��ʾ���յ��ǿɱ����, ������ int, �����Խ��ն��int(0-���)
	// 2 ʹ�ÿɱ����ʱ, ���Ե���������ʹ�� ��nums ���Ե�������
	// 3 �ɱ������ʵ�ο���������
	// 4 �ɱ�������Ժ���ͨ���͵Ĳ���һ����ڲ����б�, �����뱣֤�ɱ���������
	// 5 һ���β��б���ֻ�ܳ���һ���ɱ����
	public int sum2(int... nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}

	// �ɱ�������Ժ���ͨ���͵Ĳ���һ����ڲ����б�, �����뱣֤�ɱ���������
	public double sum3(String str, int n, double ...nums) {

	}
}
