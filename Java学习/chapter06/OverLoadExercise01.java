public class OverLoadExercise01 {
	public static void main(String[] args) {
		Methods method = new Methods();
		System.out.print("������Ϊmax=" + method.max(1, 2));
		System.out.print("������Ϊmax1=" + method.max(3.0, 5.0));
		System.out.print("������Ϊmax2=" + method.max(3.0, 7.0, 5.0));
	}
}

class Methods {
	public int max(int a, int b) {
		return a > b ? a : b;
	}

	public double max( double a, double b) {
		return a > b ? a : b;
	}

	public double max( double a, double b, double c) {
		double d = max(a, b);
		return max(c, d);
	}
}