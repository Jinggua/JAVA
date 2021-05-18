public class Yanghui {
	public static void main(String[] args) {
		/*
			1
			1 1
			1 2 1
			1 3 3  1
			1 4 6  4  1
			1 5 10 10 5 1
		*/
		int[][] yanghui = new int[10][];
		for (int i = 0; i < yanghui.length; i++) {
			for (int j = 0; j < yanghui[i].length; j++) {
				// if (i <=1) {
				// 	Yanghui[i][j] = 1;
				// } else {
				// 	Yanghui[i][j] = Yanghui[i-1][j-1] + Yanghui[i-1][j];
				// }
				if (j == 0 || j == yanghui[i].length - 1) {
					yanghui[i][j] = 1;
				} else {
					yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
				}
			}
		}

		for (int i = 0; i<yanghui.length; i++) {
			for (int j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j] + "\t");
			}
			System.out.println();
		}
	}
}