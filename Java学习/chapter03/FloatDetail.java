public class FloatDetail {
	public static void main(String[] args) {
		// Java 的浮点型常量(具体值)默认为double型, 声明 float 型常量, 需后加 'f' 或 'F'
		float num = 1.1 // 错
		float num = 1.1f; // 对	
		double num1 = 1.1; // 对
		char c = 97;
		// 科学计数法
		// 5.12e2 = 5.12 * 10^2
		// // 5.12E-2 = 5.12 / 10^2
		double num2 = 1 + 0.1;
		char c5 = 'b' + 1;
		System.out.println("c5: " + c5);
		if (num1 == num1) {
			System.out.println("yes");
			System.out.println('a' + 10);
			System.out.println("a" + 10);
		} else {
			System.out.println("no");
		}
		
	}
}