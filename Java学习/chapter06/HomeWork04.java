public class HomeWork04 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		A03 a03 = new A03();
		int[] arrNew = a03.copyArr(arr);
		for (int i = 0; i < arrNew.length; i++) {
			System.out.print(arrNew[i]);
		}
	}
}

/*
 ��д�� A03, ʵ������ĸ��ƹ��� copyArr, ���������, ����������, Ԫ�غ;�����һ��
*/

class A03 {
	public int[] copyArr(int[] arr) {
		// �ڶ��п��ռ�
		int[] arrNew = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		return arrNew; 
	}
}