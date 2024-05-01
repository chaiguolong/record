class Person{
	String name;
	int age;
	public Person(){
		System.out.println("1.public Person()");
	}

	public Person(String name, int age){
		//调用本类中无参构造方法
		this();
		this.name = name;
		this.age = age;
		System.out.println("2.public Person(String name, int age)");
	}
}
public class TestJavaThis1 {
	public static void main(String[] args) {
		new Person("张三", 25);
	}
	
}
