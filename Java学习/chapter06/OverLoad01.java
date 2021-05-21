public class OverLoad01 {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.print(mc.calculate(1, 2));
		System.out.print(mc.calculate(1, 3.0));
		System.out.print(mc.calculate(1.5, 2));
		System.out.print(mc.calculate(1, 2, 3));
	}
}


class MyCalculator {
	// 下面的 calculate 构成了重载
	// 重载就是方法名一样, 但是参数不一样(顺序或类型不一样), 返回类型无遥控
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}
	public double calculate(int n1, double n2) {
		return n1 + n2;
	}
	public double calculate(double n1, int n2) {
		return n1 + n2;
	}
	public double calculate(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	//---------------------------------------------------
	// 这两个不是重载, 是重复定义
	/*
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}

	public void calculate(int n1, int n2) {
		System.out.print(n1 + n2)
	}
	*/
}