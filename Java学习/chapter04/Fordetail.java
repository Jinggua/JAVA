class Fordetail {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// for 循环外面无法访问到 i
			System.out.println("hello");
		}


		int i= 1;
		for (i <= 10; ) {
			// i++
			System.out.println("hello");
		}
		// for 循环结束后,依然可以访问到 i
		

		// 补充
		//  表示一个无线循环, 死循环, 一般会结合 break 来写
		for (; ; ) {
			System.out.println("hello");
		}
	}
}	
