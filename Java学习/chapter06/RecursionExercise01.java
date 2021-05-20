public class RecursionExercise01 {
	/*
		请使用递归的方式求出斐波那契数 1, 1, 2 ,3 5, 8, 13, 给你一个整数n, 求出值

		思路分析: 
		1 当 n = 1 斐波那契数是 1
		2 当 n = 2 斐波那契数是 1
		3 当 n > 3 斐波那契数是前两个数的和
		4 这里就是一个递归的思路

		=========================================================================================================

		猴子吃桃: 有一堆桃子, 惠子第一天吃了其中的一半, 并再多吃了一个, 以后每天猴子都吃其中的一半, 然后在多吃一个, 当到第10天时
		想在吃时(还没吃), 发现只有一个桃子了, 最初共多少个桃子? 

		思路分析: 逆推
		1 day = 10  有 1 个桃子 
		2 day = 9 	有(day10 + 1) * 2 = 4
		3 day = 8   有(day9 + 1 ) * 2 = 10
		4 规律就是 前一天的桃子 = (后一天的桃子 + 1) * 2 // 这个得分析出来, 否则没法做 

	*/
	public static void main(String[] args) {
		T t1 = new T();
		System.out.print("n为7时 斐波那契数是" + t1.fib(7));
		int peach = t.peach(10);
	}
}

class T {
	/*
		思路分析: 
		1 当 n = 1 斐波那契数是 1
		2 当 n = 2 斐波那契数是 1
		3 当 n > 3 斐波那契数是前两个数的和
		4 这里就是一个递归的思路
	*/
	public int fib (int n) {
		if (n >= 1) {
			if (n == 1 || n == 2 ) {
				return 1;
			} else {
				return fib(n - 1) + fib(n - 2);
			}
		} else {
			System.out.print("要求n >= 1");
			return n; // 定义的时候必须有返回值, 所以这里得有返回值
		}
		
	}


	// 猴子吃桃
	// // 第9天 x个  第10 天 y 个
	//  y = (x / 2) -1   ==> x = (y + 1) * 2 
	public int peach(int day) {
		if (day == 10) { // 第10 天, 只有一个桃(剩下一个桃)
			return 1;
		} else if(day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.print("day在1-10");
			return -1;
		}
	}
}