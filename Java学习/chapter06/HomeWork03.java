public class HomeWork03 {
	public static void main(String[] args) {
		Book book = new Book("聊斋", 300);
		book.info();
		book.updatePrice();
		book.info();
	}
}
/*
	编写类 Book, 定义方法 updatePrice, 实现更改某本书的价格, 如果价格 > 150, 则更改为150, 
	如果价格 > 100, 更改为100, 否则不变
	
	分析
	1 类名 Book
	2 属性 price name
	3 方法名 updatePrice
	4 形参()
	5 返回值 void
	6 提供构造器
*/
class Book {
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	} 
	public void updatePrice() {
		// 如果方法中没有局部变量 price, this 可以省略, this.price 等价 price
		if (this.price > 150) {
			this.price = 150;
		} else if(this.price > 100) {
			this.price = 100;
		}
	}
	public void info() {
		System.out.println("name=" + this.name + "price=" + this.price);
	}
}