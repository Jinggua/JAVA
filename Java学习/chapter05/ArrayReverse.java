/*
	Ҫ��: �������Ԫ�����ݷ�ת 

 */
public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55, 66};
		// ��������� 
		// for (int i = 0; i < arr.length; i++) {
		// 	arr[i] = arr[arr.length - 1 - i];
		// }
		/*
			˼·:
			1 �� arr[0] �� arr[5] ���н��� {66, 22, 33, 44, 55, 11}
			2 �� arr[1] �� arr[4] ���н��� {66, 55, 33, 44, 22, 11}
		 	3 �� arr[2] �� arr[3] ���н��� {66, 55, 44, 33, 22, 11}
		 	4 һ������ 3 ��, arr.length / 2
		 	5 ÿ�ν���ʱ, ��Ӧ���±��� arr[i] �� arr[arr.length - 1 - i]
		 */
		// int temp = 0;
		int len = arr.length
		// for (int i = 0;i < len / 2; i++) {
		// 	temp = arr[len - 1- i];  // 
		// 	arr[len - 1 - i] = arr[i];
		// 	arr[i] = temp;
		// }
		// for (int i = 0; i < len; i++) {
		// 	System.out.println(arr[i]);
		// }
		// -----------------------------
		/*
			����2  ����ֵ��
			˼·:
			1 �ȴ���һ���µ�����, ��СΪ arr.length
			2 �������arr, ��ÿ��Ԫ�ؿ�����arr2��Ԫ����
			3 arr ָ��������, arr ԭ�������ݿռ�û�б������ûᱻ������������
		*/
		int[] arr2 = new int[len];
		for (int i = len - 1;i >= 0; i--) {
			arr2[len - 1 -i] = arr[i];
		}
		arr = arr2; 
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
	}
}

