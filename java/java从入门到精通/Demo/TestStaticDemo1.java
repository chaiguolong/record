class Person{
	String name;
	String city;
	int age;
	public Person(String name, String city, int age){
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String talk(){
		return "我是: " + this.name + ", 今年: " 
					+ this.age + "岁, 来自: " + this.city;
	}
}
public class TestStaticDemo1 {
	public static void main(String[] args) {
		Person p1 = new Person("张三", "中国", 25);
		Person p2 = new Person("李四", "中国", 30);
		Person p3 = new Person("王五", "中国", 35);
		System.out.println(p1.talk());
		System.out.println(p2.talk());
		System.out.println(p3.talk());
	}
	
}
