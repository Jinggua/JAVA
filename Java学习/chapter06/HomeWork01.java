/*
	编写类A01, 定义方法max, 实现求某个double数组的最大值, 并返回
*/
public class HomeWork01 {
	public static void main(String[] args) {
		A01 a01 = new A01();
		double[] arr = {1.0, 4.7, 1.8};
		// Person p = null  对象可以这样做的
		Double res = a01.max(arr);
		if (res != null) {
			System.out.println("arr的最大值=" + a01.max(arr));
		} else {
			System.out.println("arr 输入有误");
		
	}
}

/*
	思路分析
	1 类名 A01
	2 方法名 max
	3 形参 (double[])
	4 返回值 double
*/

// 先完成正常业务, 然后在考虑代码健壮性
class A01 {
	public Double max(double[] arr) {
		// 保证 arr 至少有一个元素
		if (arr != null && arr.length > 0) {
			double max = arr[0]; // 假定第一个元素就是最大值 
			for (int i = 1; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			return max; // double
		} else {
			// 如果长度不大于0, 需要有一个返回值
			return null;
		}
		
	}
}