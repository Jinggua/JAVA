public class TwoDimensionalArray02 {
	public static void main(String[] args) {
		// 动态创建二维数组, 一共有3个一维数组, 但是每个一维数组还没有开数据空间
		int arr[][] = new int[3][]; // 一维数组中的元素个数不确定就不写

		for (int i = 0; i < arr.length; i++) { // 遍历 arr 每个一维数组 
			// 给每个一维数组开空间
			// 如果没有给一维数组 new, 那么 arr[i] 就是 null, 开了存放的就是地址
			arr[i] = new int[i + 1];
			// 遍历一维数组, 并给一维数组的每个元素赋值
			for (int i = 0; i < arr[i].length; i++) {
				arr[i][j] = i + 1; 
			}
		}
	}
}