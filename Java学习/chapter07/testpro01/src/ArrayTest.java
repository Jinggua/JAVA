
public class ArrayTest {
    public static void main(String[] args) {
//        Scanner my = new Scanner(System.in); // alt + enter 自动倒入类
        int[] arr = {6, 5, 4, 3, 2, 1};
        MyTools myTools = new MyTools();
        myTools.bubble(arr);
        // 输出排序后的arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

// 创建一个类 myTools, 编写一个方法, 可以完成对 int 数组冒泡排序的功能
class MyTools {
    public void bubble(int[] arr) {
        // 冒泡排序
        // 外层循环
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // 交换
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }
}
