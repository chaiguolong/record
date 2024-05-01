class Person{
	String name;
	int age;
	void talk(){
		System.out.println("我是: "+name+", 今年: "+age+"岁");
	}
}


public class TestPersonDemo2 {
	public static void main(String[] args) {
		//声明并实例化一个Person对象p
		Person p = new Person();
		//给p中的属性赋值
		p.name = "张三";
		//在这里将对象p的年龄属性赋值为-25
		p.age = -25;
		//调用Person类中的talk()方法
		p.talk();
	}
	
}
