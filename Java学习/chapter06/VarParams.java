public class VarParams {
	public static void main(String[] args) {
		Method m = new Method();
		System.out.print("和为: " + m.sum2(10, 20));
		System.out.print("和为: " + m.sum2(100, 200));

		int[] arr = {1, 2, 3, 4};
		System.out.print("数组和为: " + m.sum2(arr));
	}
}

class Method {
	// 计算 2 个数的和 3 个数的和 4 ..5 .. 个数的和
	
	// 重载的方法做
	// 缺点: 麻烦
	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	public int sum(int n1, int n2, int n3, int n4) {
		return n1 + n2 + n3 + n4;
	}


	// 上面的三个方法名字相同, 功能相同, 只是参数个数不同, 可以使用可变参数
	// 可变参数
	// 1 int... 表示接收的是可变参数, 类型是 int, 即可以接收多个int(0-多个)
	// 2 使用可变参数时, 可以当做数组来使用 即nums 可以当做数组
	// 3 可变参数的实参可以是数组
	// 4 可变参数可以和普通类型的参数一起放在参数列表, 丹必须保证可变参数在最后
	// 5 一个形参列表中只能出现一个可变参数
	public int sum2(int... nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}

	// 可变参数可以和普通类型的参数一起放在参数列表, 丹必须保证可变参数在最后
	public double sum3(String str, int n, double ...nums) {

	}
}
