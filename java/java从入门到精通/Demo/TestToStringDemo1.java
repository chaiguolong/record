class Person extends Object{
	String name = "张三";
	int age = 25;
}
public class TestToStringDemo1 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
	}
	
}
