public class ArrayCopy {
	public static void main(String[] args) {
		// ��д����, ʵ�����鿽��, Ҫ�����ݿռ����
		// �� int[] arr1 = {10, 20, 30} ������arr2����
		
		// ������п���, ���ֻ����arr2 ָ�� arr1, ���ݿռ䲻�Ƕ�����
		// int[] arr1 = {10, 20, 30};
		// int[] arr2 = arr1;
		// 
		// 
		//---------------------------------------
		// ˼·����
		// 1 ����һ���µ����� arr2, �����µ����ݿռ�
		// 2 ��СΪ arr1.length
		// 3 ���� arr1, ��ÿ��Ԫ�ؿ����� arr2 ��Ӧ��λ��
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[arr1.length];
		for (int i= 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

	}
}