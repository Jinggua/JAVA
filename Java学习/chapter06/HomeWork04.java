public class HomeWork04 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		A03 a03 = new A03();
		int[] arrNew = a03.copyArr(arr);
		for (int i = 0; i < arrNew.length; i++) {
			System.out.print(arrNew[i]);
		}
	}
}

/*
 编写类 A03, 实现数组的复制功能 copyArr, 输入就数组, 返回新数组, 元素和旧数组一样
*/

class A03 {
	public int[] copyArr(int[] arr) {
		// 在堆中开空间
		int[] arrNew = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		return arrNew; 
	}
}