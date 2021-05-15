// 数组练习2
public class ArrayExercise02 {
	public static void main(String[] args) {
		int[] arr = {4, -1, 9, 10, 23};
		int maxIndex = 0;
		int max = arr[0];
		for (int i= 1;i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值为" + max + "下标为" + maxIndex);
	}
}