public class TwoDimensionalArray01 {
	public static void main(String[] args) {
		// ��ά����: 
		// 1 �Ӷ�����ʽ�Ͽ� int[][]
		// 2 �����������, �����е�ÿ��Ԫ����һά����, �͹��ɶ�ά���� 
		/*
			���ö�ά�����������ͼ��
			0 0 0 0 0 0
			0 0 1 0 0 0
			0 2 0 3 0 0
			0 0 0 0 0 0
		*/ 
	    int[][] arr = {{0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0}};
		// �����ά����
		for (int i = 0; i < arr.length; i++) { // ������ά����
			// arr[i].length �õ���Ӧ��ÿ��һά����ĳ���
			for (int j =0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		// ------------------------------
		// ��ά����Ķ��巽ʽ
		// ��ʽ1 : int arr[][] = new int[2][3]
		// ��ʽ2 : 
		//  int arr2[][] 
		//  arr2 = new int[2][3]
	}
}