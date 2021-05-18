public class PropertiesDetial {
	public static void main(String[] args) {
		/*
			如何创建对象		
		 */
		// p1 是对象名(对象引用)
		// new Person() 创建的对象空间(数据) 才是真正的对象
		Person p1 = new Person()
		
		// 对象的属性默认值遵守数组规则: int 0, short 0, byte 0, long 0, 
		// float 0.0, double 0.0, char \u0000,  boolean false. String null
		// 
	
}

class Person {
	// 四个属性
	int age;
	String name;
	double sal;
	boolean isPass;
}