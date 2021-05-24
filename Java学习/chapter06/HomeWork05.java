public class HomeWork05 {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println("面积=" + circle.area() + "周长=" + circle.len());
	}
}

/*
	定义一个圆类Circle, 定义属性 半径, 提供显示圆周长功能的方法, 提供显示圆面积的方法
*/

class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	public double area() {
		return Math.PI * this.radius * this.radius;
	}

	public double len() {
		return 2 * Math.PI * this.radius;
	}
}