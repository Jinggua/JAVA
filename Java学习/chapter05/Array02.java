import java.util.Scanner;
public class Array02 {
	public static void main(String[] args) {
		//�����ʹ�� 
		//����Ķ��巽ʽ1
		//�������� ������[] = new ��������[��С]    int a[] = new int[5]
		double[] scores = new double[5];
		for (int i = 0; i < scores.length; i++) {
			System.out.println("�����" + i + "��Ԫ��");
			Scanner myScaaner = new Scanner(System.in);
			scores[i] = myScaaner.nextDouble();
			System.out.println(scores[i]);
		}
		// ���
		for (int i = 0; i < scores.length; i++) {
			System.out.println("��" + i + "��Ԫ��Ϊ" + scores[i]);
			
		}

		// ����Ķ��巽ʽ2
		double[] scores1 // ��������, ��ʱ scores1 �� null
		scores1 = new double[5]; // �����ڴ�ռ�, ���Դ������

		// ����Ķ��巽ʽ3
		// �������� ������[] = {Ԫ��...}  int a[] = {1, 2, 3, 4}
	}
}