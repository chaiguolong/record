class Person{
	String name;
	int age;

	public String talk(String name){
		return name+"在说话...";
	}

	public String talk(String name, int age){
		return age+"岁的"+name+"在说话...";
	}
}

class Student extends Person{
	String school;

	// public Student(String name, int age){
	// 	this.name = name;
	// 	this.age = age;
	// }
	
	public String talk(String name){
		return name+"在教室回答问题...";
	}
}
public class OverLoadAndOverWrite {
	public static void main(String[] args) {
		Person p = new Student();
		System.out.println(p.talk("张三",20));
		System.out.println(p.talk("张三"));
	}
}
