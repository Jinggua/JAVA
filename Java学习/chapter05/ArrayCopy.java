public class ArrayCopy {
	public static void main(String[] args) {
		// 编写代码, 实现数组拷贝, 要求数据空间独立
		// 将 int[] arr1 = {10, 20, 30} 拷贝到arr2数组
		
		// 这个不叫拷贝, 这个只是让arr2 指向 arr1, 数据空间不是独立的
		// int[] arr1 = {10, 20, 30};
		// int[] arr2 = arr1;
		// 
		// 
		//---------------------------------------
		// 思路分析
		// 1 创建一个新的数组 arr2, 开辟新的数据空间
		// 2 大小为 arr1.length
		// 3 遍历 arr1, 把每个元素拷贝到 arr2 对应的位置
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[arr1.length];
		for (int i= 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

	}
}