public class Array01 {
	public static void main(String[] args) {
		// 定义数组
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		// 遍历数组, 得到所有元素的和
		for (int i = 0; i < hens.length ; i++) {
			System.out.println("第" + i + "个元素为" + hens[i]);
		}
	}
} 