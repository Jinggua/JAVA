public class ArrayAdd {
	public static void main(String[] args) {
		/*
			Ҫ��: ʵ�ֶ�̬�ĸ��������Ԫ��, ʵ�ֶ����������
			1 ԭʼ����ʹ�þ�̬���� int[] arr = {1,2,3}
			2 ���ӵ�Ԫ��4, ֱ�ӷ����������� arr = {1,2,3,4}
			3 �û�����ͨ�����·����������Ƿ�������, ��ӳɹ�, �Ƿ����? y/n?
		*/
		int[] arr = {1,2,3};
		// arr[3] = 4  ��ᱨ���, Խ���� 
		int[]arrNew = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		// �� 4 �������һ��Ԫ��
		arrNew[arrNew.length - 1] = 4;
		arr = arrNew;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}