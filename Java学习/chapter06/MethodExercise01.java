public class MethodExercise01 {
	public static void main(String[] args) {
		/*
			编写类 AA 方法, 判断一个数是奇数还是偶数, 返回boolean
		*/
		AA a = new AA();
		// boolean b = a.isOdd(10);
		// if (b) {
		// 	System.out.print("偶数");
		// } else {
		// 	System.out.print("奇数");
		// }
		a.print(5, 5, '#');
	}
}

class AA {
	public boolean isOdd(int n) {
		// if (n % 2 == 0) {
		// 	return true;
		// } else {
		// 	return false;
		// }

		// 优化下
		return n % 2 == 0 ? true : false;
	}

	public void print(int row, int col, char c) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}