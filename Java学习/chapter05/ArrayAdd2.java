import java.util.Scanner;
public class ArrayAdd2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		// arr[3] = 4  这会报错的, 越界了 
		Scanner myScanner = new Scanner(System.in);
		do {
			int[]arrNew = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println("请输入你要添加的元素");
			int addNum = myScanner.nextInt();
			// 把 4 赋给最后一个元素
			arrNew[arrNew.length - 1] = addNum;
			arr = arrNew;
			// 问用户是否继续
			System.out.println("是否继续添加y/n");
			char key = myScanner.next().charAt(0);
			if (key == 'n') {
				break;
			}
		} while(true);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
	}
}