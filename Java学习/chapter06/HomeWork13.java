/*
	��ĿҪ��: 
	1 ����һ��Circle��, ����һ��double�͵�radius���Դ���Բ�İ뾶, findArea()��������Բ�����
	2 ����һ���� PassObject, �����ж���һ������ printAreas(), �÷����Ķ�������:
	  public void printAreas(Circle c, int times)
	3 �� printAreas �����д�ӡ��� 1 �� times ֮���ÿ�������뾶ֵ, �Լ���Ӧ�����
	  ���� times Ϊ 5, ������뾶1, 2, 3, 4, 5 �Լ���Ӧ��Բ���
	4 ��main�����е��� printAreas() ����, ������Ϻ������ǰ�İ뾶ֵ
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
	// ��ʵ������������ûɶ��
	public Circle() { // �޲ι�����

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
			c.setRadius(i); // �޸İ뾶ֵ
			c.findArea();
			System.out.println((double) i + "\t" + c.findArea());
		}
	}
}