/*
	���1-100֮��Ĳ��ܱ�5��������, ÿ5��һ��
	˼·: count % 5 = 0 ��˵������� 5 ��
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
				// �Ľ�
				if (count % 5 == 0) {
					System.out.println();	
				}
			}
		}
	}
}