/*
	�ж�һ�������ǲ���ˮ�ɻ���, ��νˮ�ɻ�����ָһ��3λ��, �����λ�����������͵����䱾��
	���� 153 = 1*1*1 + 3*3*3 = 5*5*5
 	˼·����:
 	1 ���� int n = 153
 	2 �ȵõ� n �İ�λ ʮλ ��λ ����
 	3 ��λ n / 100  
 	4 ʮλ  n % 100 / 10
 	5 ��λ n % 10
 	6 �жϼ���
 */
public class HomeWork02 {
	public static void main(String[] args) {
		int n = 153;
		int n1 = n / 100;
		int n2 = n % 100 / 10;
		int n3 = n % 10;
		if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n) {
			System.out.println(n + "��ˮ�ɻ���"); 
		} else {
			System.out.println(n + "����ˮ�ɻ���"); 
		}
	}
}