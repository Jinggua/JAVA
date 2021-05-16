public class ArrayAdd {
	public static void main(String[] args) {
		/*
			要求: 实现动态的给数组添加元素, 实现对数组的扩容
			1 原始数组使用静态分配 int[] arr = {1,2,3}
			2 增加的元素4, 直接放在数组的最后 arr = {1,2,3,4}
			3 用户可以通过如下方法来决定是否继续添加, 添加成功, 是否继续? y/n?
		*/
		int[] arr = {1,2,3};
		// arr[3] = 4  这会报错的, 越界了 
		int[]arrNew = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		// 把 4 赋给最后一个元素
		arrNew[arrNew.length - 1] = 4;
		arr = arrNew;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}