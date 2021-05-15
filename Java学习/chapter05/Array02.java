import java.util.Scanner;
public class Array02 {
	public static void main(String[] args) {
		//数组的使用 
		//数组的定义方式1
		//数据类型 数组名[] = new 数据类型[大小]    int a[] = new int[5]
		double[] scores = new double[5];
		for (int i = 0; i < scores.length; i++) {
			System.out.println("输入第" + i + "个元素");
			Scanner myScaaner = new Scanner(System.in);
			scores[i] = myScaaner.nextDouble();
			System.out.println(scores[i]);
		}
		// 输出
		for (int i = 0; i < scores.length; i++) {
			System.out.println("第" + i + "个元素为" + scores[i]);
			
		}

		// 数组的定义方式2
		double[] scores1 // 声明数组, 这时 scores1 是 null
		scores1 = new double[5]; // 分配内存空间, 可以存放数据

		// 数组的定义方式3
		// 数据类型 数组名[] = {元素...}  int a[] = {1, 2, 3, 4}
	}
}