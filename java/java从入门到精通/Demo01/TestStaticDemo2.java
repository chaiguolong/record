class Person{
	String name;
	static String city = "中国";
	int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String talk(){
		return "我是: "+this.name+", 今年: "+this.age+"岁, 来自: "+city;
	}
}
public class TestStaticDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("张三", 25);
		Person p2 = new Person("李四", 30);
		Person p3 = new Person("王五", 35);
		System.out.println("修改之前信息: "+p1.talk());
		System.out.println("修改之前信息: "+p2.talk());
		System.out.println("修改之前信息: "+p3.talk());
		System.out.println("******** 修改之后信息********");
		//修改后的信息
		Person.city = "美国";
		System.out.println("修改之前信息: "+p1.talk());
		System.out.println("修改之前信息: "+p2.talk());
		System.out.println("修改之前信息: "+p3.talk());
	}
	
}
