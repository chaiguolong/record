class Person{
	private String name;
	private int age;
	public Person(String n, int a){
		name = n;
		age = a;
		System.out.println("public Person(String n, int a)");
	}

	public String talk(){
		return "我是: " +name+", 今年: "+age+"岁";
	}
}

public class TestConstruct1 {
	public static void main(String[] args) {
		Person p = new Person("张三", 25);
		System.out.println(p.talk());
	}
	
}
