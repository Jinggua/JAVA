import java.util.Scanner; // ��ʾ�� java.util�µģ�canner�ർ��
public class Input {
	public static void main(String[] args) {
		// ��ʾ�����û�����
		// ����: �� -> �� -> ���� 
		// 1 ���� Scanner �����ڵİ�
		// 2 ���� Scanner ����, 
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String name = scanner.next();
		System.out.println("����: " + name);
	}
}