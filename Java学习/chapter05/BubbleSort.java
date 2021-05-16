public class BubbleSort {
	public static void main(String[] args) {
		/*
		化繁为简 先死后活

		*/
		int temp = 0;
		int[] arr = {24, 69, 80, 57, 13};
		for (int i= 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// 输出看一下
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}