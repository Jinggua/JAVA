public class Homework01 {
	public static void main(String[] args) {
		/*
			已知有个升序的数组, 要求插入一个元素, 该数组的顺序一人是升序
			[10, 12, 45, 90]  添加 23 后 变为 [10, 12, 23, 45, 90]
		*/
		int[] arr = {10, 12, 45, 90};
		int len = arr.length;
		// 扩容
		int[] arrNew = new int[len + 1];
		int index = 0;
		int num = 23;
		for (int i = 0; i < len; i++) {
			if(i < len - 1) {
				if (arr[i] <= num && arr[i+1] > num) {
					index = i;
					break;
				}
			} else {
				// 最后一个元素
				index = len;
			}
		}
		 
		System.out.println("index = " + index);
		// 不是加在最后一个
		if (index < len) {
			for (int i = 0; i <= index; i++) {
				arrNew[i] = arr[i];
			}
			arrNew[index + 1] = num;
			for (int i = index + 1; i< len; i++) {
				arrNew[i + 1] = arr[i];
			}
		} else {
			// 加在最后一个位置
			for (int i = 0; i < index; i++) {
				arrNew[i] = arr[i];
			}
			arrNew[index] = num;
		}
		// 输出
		for (int i = 0; i < arrNew.length; i++) {
			System.out.print(arrNew[i] + "\t");
		}
	}
}