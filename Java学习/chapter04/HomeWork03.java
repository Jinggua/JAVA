/*
	输出1-100之间的不能被5整除的数, 每5个一行
	思路: count % 5 = 0 就说明输出了 5 个
 */
public class HomeWork03 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1;i <= 100; i++) {
			if (i % 5 != 0) {
				System.out.print(i + "\t");
				count++;
				// if (count == 5) {
				// 	System.out.println();
				// 	count = 0;
				// }
				// 改进
				if (count % 5 == 0) {
					System.out.println();	
				}
			}
		}
	}
}