import java.util.Scanner;
public class ArrayAdd2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		// arr[3] = 4  ��ᱨ���, Խ���� 
		Scanner myScanner = new Scanner(System.in);
		do {
			int[]arrNew = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println("��������Ҫ��ӵ�Ԫ��");
			int addNum = myScanner.nextInt();
			// �� 4 �������һ��Ԫ��
			arrNew[arrNew.length - 1] = addNum;
			arr = arrNew;
			// ���û��Ƿ����
			System.out.println("�Ƿ�������y/n");
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