/*
	要求: 把数组的元素内容反转 

 */
public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55, 66};
		// 错误的做法 
		// for (int i = 0; i < arr.length; i++) {
		// 	arr[i] = arr[arr.length - 1 - i];
		// }
		/*
			思路:
			1 把 arr[0] 和 arr[5] 进行交换 {66, 22, 33, 44, 55, 11}
			2 把 arr[1] 和 arr[4] 进行交换 {66, 55, 33, 44, 22, 11}
		 	3 把 arr[2] 和 arr[3] 进行交换 {66, 55, 44, 33, 22, 11}
		 	4 一共交换 3 次, arr.length / 2
		 	5 每次交换时, 对应的下标是 arr[i] 和 arr[arr.length - 1 - i]
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
			方法2  逆序赋值法
			思路:
			1 先创建一个新的数组, 大小为 arr.length
			2 逆序遍历arr, 将每个元素拷贝到arr2的元素中
			3 arr 指向新数组, arr 原来的数据空间没有变量引用会被当做垃圾销毁
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

