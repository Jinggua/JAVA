public class HomeWork05 {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println("���=" + circle.area() + "�ܳ�=" + circle.len());
	}
}

/*
	����һ��Բ��Circle, �������� �뾶, �ṩ��ʾԲ�ܳ����ܵķ���, �ṩ��ʾԲ����ķ���
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