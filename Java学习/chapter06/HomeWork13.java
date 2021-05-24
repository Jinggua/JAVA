/*
	题目要求: 
	1 定义一个Circle类, 包含一个double型的radius属性代表圆的半径, findArea()方法返回圆的面积
	2 定义一个类 PassObject, 在类中定义一个方法 printAreas(), 该方法的定义如下:
	  public void printAreas(Circle c, int times)
	3 在 printAreas 方法中打印输出 1 倒 times 之间的每个整数半径值, 以及对应的面积
	  例如 times 为 5, 则输出半径1, 2, 3, 4, 5 以及对应的圆面积
	4 在main方法中调用 printAreas() 方法, 调用完毕后输出当前的半径值
*/
public class HomeWork13 {
	public static void main(String[] args) {
		Circle circle = new Circle();
		PassObject passObject = new PassObject();
		passObject.printAreas(circle, 5);
	}
}

class Circle {
	double radius;
	// 其实这两个构造器没啥用
	public Circle() { // 无参构造器

	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return Math.PI * this.radius * this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class PassObject {
	public void printAreas(Circle c, int times) {
		System.out.println("Radius\tArea");
		for (int i = 1; i <= times; i++) {
			c.setRadius(i); // 修改半径值
			c.findArea();
			System.out.println((double) i + "\t" + c.findArea());
		}
	}
}