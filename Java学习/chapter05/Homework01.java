public class Homework01 {
	public static void main(String[] args) {
		/*
			��֪�и����������, Ҫ�����һ��Ԫ��, �������˳��һ��������
			[10, 12, 45, 90]  ��� 23 �� ��Ϊ [10, 12, 23, 45, 90]
		*/
		int[] arr = {10, 12, 45, 90};
		int len = arr.length;
		// ����
		int[] arrNew = new int[len + 1];
		int index = 0;
		int num = 23;
		for (int i = 0; i < len; i++) {
			if(i < len - 1) {
				if (arr[i] <= num && arr[i+1] > num) {
					index = i;
					break;
				}
			} else {
				// ���һ��Ԫ��
				index = len;
			}
		}
		 
		System.out.println("index = " + index);
		// ���Ǽ������һ��
		if (index < len) {
			for (int i = 0; i <= index; i++) {
				arrNew[i] = arr[i];
			}
			arrNew[index + 1] = num;
			for (int i = index + 1; i< len; i++) {
				arrNew[i + 1] = arr[i];
			}
		} else {
			// �������һ��λ��
			for (int i = 0; i < index; i++) {
				arrNew[i] = arr[i];
			}
			arrNew[index] = num;
		}
		// ���
		for (int i = 0; i < arrNew.length; i++) {
			System.out.print(arrNew[i] + "\t");
		}
	}
}