// 数组练习1
public class ArrayExercise01 {
	public static void main(String[] args) {
		char[] chars = new char[26];
		for (int i = 0; i< chars.length; i++) {
			chars[i] = (char)('A' + i);   // char 的本质是一个整数, 所以这里需要进行强制类型转换
		}
		for (int i = 0; i< chars.length; i++) {
			System.out.println(chars[i]);
		}
	}
}