/*
	编写类A02, 定义方法find, 查找某字符串是否在字符串数组中, 找到返回索引, 如果找不到 返回 -1
*/
public class HomeWork02 {
	public static void main(String[] args) {
		String[] arr = {"sdy", "tl", "lee"};
		String str = "ooo";
		A02 a02 = new A02();
		System.out.println(str + "在数组中的index= " + a02.find(arr, str));

	}
}

class A02 {
	// 用 Integer 不用int 是健壮性
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