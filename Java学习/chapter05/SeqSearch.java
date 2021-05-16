import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] args) {
		// 顺序查找
		String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青衣蝠王"}
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String findName = myScanner.next();
		// 没找到的标记, 一个flage
		int index = -1;  
		// 遍历数组, 逐一比较
		for (int i = 0; i < names.length; i++) {
			if (findName.equals(names[i])) {
				System.out.println("找到了");
				System.out.println("下标为" + i);
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("没有找到");
		}
	}
}