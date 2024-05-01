class Person{
	String name;
	int age;
	String like;
	public Person(String name, int age, String like){
		this.name = name;
		this.age = age;
		this.like = like;
	}
}
public class homework02_9_7 {
	public static void main(String[] args) {
		Person p = new Person("张三", 25, "购物");
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.like);
	}
	
}
