class Person{
	String name;
	int age;
}
public class TestRefDemo1 {
	public static void main(String[] args) {
		//声明一个对象p1,此对象的值为null,表示未实例化
		Person p1 = null;
		//声明衣蛾对象p2,此对象的值为null,表示未实例化
		Person p2 = null;
		//实例化p1对象
		p1 = new Person();
		//为p1对象中的属性赋值
		p1.name = "张三";
		p1.age = 25;
		//将p1的引用赋给p2
		p2 = p1;
		//输出p2对象中的属性
		System.out.println("姓名: "+p2.name);
		System.out.println("年龄: "+p2.age);
		p1 = null;
	}
	
}
