class Person{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String talk(){
		return "我是: "+name+", 今年: "+age+"岁";
	}
}
public class TestJavaThis {
	public static void main(String[] args) {
		Person p = new Person("张三", 25);
		System.out.println(p.talk());
	}
	
}
