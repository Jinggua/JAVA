/*
	��д��A02, ���巽��find, ����ĳ�ַ����Ƿ����ַ���������, �ҵ���������, ����Ҳ��� ���� -1
*/
public class HomeWork02 {
	public static void main(String[] args) {
		String[] arr = {"sdy", "tl", "lee"};
		String str = "ooo";
		A02 a02 = new A02();
		System.out.println(str + "�������е�index= " + a02.find(arr, str));

	}
}

class A02 {
	// �� Integer ����int �ǽ�׳��
	public Integer find(String[] arr, String str) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (str.equals(arr[i])) {
				index = i;
			}
		}
		return index;
	}
}