public class MiGong {
	/*
		˼·: 
		1 �ȴ����Թ�, �ö�ά�����ʾ int[][] = new int[8][7]
		2 �ȹ涨 map �����Ԫ��ֵ: 0 ��ʾ������ 1 ��ʾ�ϰ���
	*/
	public static void main(String[] args) {
		int[][] map = new int[8][7];
		// ���������һ�� ���������һ��ȫ������Ϊ1
		for (int i = 0; i < map.length; i++) {
			for (int j =  0; j < map[i].length; j++) {
				if (i == 0 || i == map.length - 1) {
					map[i][j] = 1;
				}
				if (j == 0 || j == map[i].length - 1) {
					map[i][j] = 1;
				}
			}
		}
		map[3][1] = 1;
		map[3][2] = 1;
		// ��ӡ�µ�ͼ
		for (int i = 0; i < map.length; i++) {
			for (int j =  0; j < map[i].length; j++) {
					System.out.print(map[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}
}

class T {
	// ʹ�õݹ� ���ݵ�˼�������������Թ�
	// 
	// 1 findway ����ר�����ҳ��Թ�·��
	// 2 ����ҵ�, �ͷ��� true, ���� ����false
	// 3 map ���Ƕ�ά����, ��ʾ�Թ�, 
	// 4 i, j ��ʾ����ĳ���ʼλ��, ��ʼ����λ����(1, 1)
	public boolean findway(int[][], int i, int j) {

	}
}