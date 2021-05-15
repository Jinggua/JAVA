/*
	判断一个整数是不是水仙花数, 所谓水仙花数是指一个3位数, 其各个位上数字立方和等于其本身
	例如 153 = 1*1*1 + 3*3*3 = 5*5*5
 	思路分析:
 	1 比如 int n = 153
 	2 先得到 n 的百位 十位 个位 数字
 	3 百位 n / 100  
 	4 十位  n % 100 / 10
 	5 个位 n % 10
 	6 判断即可
 */
public class HomeWork02 {
	public static void main(String[] args) {
		int n = 153;
		int n1 = n / 100;
		int n2 = n % 100 / 10;
		int n3 = n % 10;
		if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n) {
			System.out.println(n + "是水仙花数"); 
		} else {
			System.out.println(n + "不是水仙花数"); 
		}
	}
}