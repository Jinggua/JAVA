import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] args) {
		// ˳�����
		String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"}
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		String findName = myScanner.next();
		// û�ҵ��ı��, һ��flage
		int index = -1;  
		// ��������, ��һ�Ƚ�
		for (int i = 0; i < names.length; i++) {
			if (findName.equals(names[i])) {
				System.out.println("�ҵ���");
				System.out.println("�±�Ϊ" + i);
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("û���ҵ�");
		}
	}
}