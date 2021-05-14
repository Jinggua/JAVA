import java.util.Scanner; // 表示把 java.util下的Ｓcanner类导入
public class Input {
	public static void main(String[] args) {
		// 演示接收用户输入
		// 步骤: 包 -> 类 -> 方法 
		// 1 引入 Scanner 类所在的包
		// 2 创建 Scanner 对象, 
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String name = scanner.next();
		System.out.println("名字: " + name);
	}
}