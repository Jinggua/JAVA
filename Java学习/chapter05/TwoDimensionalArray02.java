public class TwoDimensionalArray02 {
	public static void main(String[] args) {
		// ��̬������ά����, һ����3��һά����, ����ÿ��һά���黹û�п����ݿռ�
		int arr[][] = new int[3][]; // һά�����е�Ԫ�ظ�����ȷ���Ͳ�д

		for (int i = 0; i < arr.length; i++) { // ���� arr ÿ��һά���� 
			// ��ÿ��һά���鿪�ռ�
			// ���û�и�һά���� new, ��ô arr[i] ���� null, ���˴�ŵľ��ǵ�ַ
			arr[i] = new int[i + 1];
			// ����һά����, ����һά�����ÿ��Ԫ�ظ�ֵ
			for (int i = 0; i < arr[i].length; i++) {
				arr[i][j] = i + 1; 
			}
		}
	}
}