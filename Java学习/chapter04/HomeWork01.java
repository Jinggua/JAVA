/*
ĳ����100,000Ԫ, ÿ����һ��·��, ��Ҫ�ɷ�, ��������:
1) ���ֽ� > 50000ʱ, ÿ�ν� 5%
2) ���ֽ�<=50000ʱ, ÿ�ν�1000
������˿��Ծ������ٸ�·��, ʹ��while �� break ���
 */
public class HomeWork01 {
	public static void main(String[] args) {
		int total = 0;
		double money = 100000;
		while(true) {
			if (money > 50000) {
				total++;
				money -= money * 0.05;
			} else if(money >= 1000) {
				money -= 1000;
				total++;
			} else  {
				// Ǯ������
				break;
			}
		}
		System.out.println(100000 + "���Թ�" + total + "��·��");
	}
}