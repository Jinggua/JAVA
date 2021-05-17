public class TwoDimensionalArray01 {
	public static void main(String[] args) {
		// 二维数组: 
		// 1 从定义形式上看 int[][]
		// 2 可以这样理解, 数组中的每个元素是一维数组, 就构成二维数组 
		/*
			请用二维数组输出如下图形
			0 0 0 0 0 0
			0 0 1 0 0 0
			0 2 0 3 0 0
			0 0 0 0 0 0
		*/ 
	    int[][] arr = {{0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0}};
		// 输出二维数组
		for (int i = 0; i < arr.length; i++) { // 遍历二维数组
			// arr[i].length 得到对应的每个一维数组的长度
			for (int j =0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		// ------------------------------
		// 二维数组的定义方式
		// 方式1 : int arr[][] = new int[2][3]
		// 方式2 : 
		//  int arr2[][] 
		//  arr2 = new int[2][3]
	}
}