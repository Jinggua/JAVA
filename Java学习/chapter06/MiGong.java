public class MiGong {
	/*
		思路: 
		1 先创建迷宫, 用二维数组表示 int[][] = new int[8][7]
		2 先规定 map 数组的元素值: 0 表示可以走 1 表示障碍物
	*/
	public static void main(String[] args) {
		int[][] map = new int[8][7];
		// 将最上面的一行 和最下面的一行全部设置为1
		for (int i = 0; i < map.length; i++) {
			for (int j =  0; j < map[i].length; j++) {
				if (i == 0 || i == map.length - 1) {
					map[i][j] = 1;
				}
				if (j == 0 || j == map[i].length - 1) {
					map[i][j] = 1;
				}
			}
		}
		map[3][1] = 1;
		map[3][2] = 1;
		// 打印下地图
		for (int i = 0; i < map.length; i++) {
			for (int j =  0; j < map[i].length; j++) {
					System.out.print(map[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}
}

class T {
	// 使用递归 回溯的思想来解决老鼠出迷宫
	// 
	// 1 findway 就是专门来找出迷宫路径
	// 2 如果找到, 就返回 true, 否则 返回false
	// 3 map 就是二维数组, 表示迷宫, 
	// 4 i, j 表示老鼠的出初始位置, 初始化的位置我(1, 1)
	public boolean findway(int[][], int i, int j) {

	}
}