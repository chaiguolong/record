class Person{
	private String name;
	private int age;
	private String like;

	public Person(String name, int age, String like){
		System.out.println("我是"+name+", 今年"+age+",喜欢"+like);
	}
}
public class homework01_09 {
	public static void main(String[] args) {
		Person p = new Person("张三", 25, "体育");
	}
	
}
