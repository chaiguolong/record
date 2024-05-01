class Person{
	String name;
	int age;
	String like;
	public Person(){}
	public Person(String name, int age, String like){
		this.name = name;
		this.age = age;
		this.like = like;
	}
	public String talk(){
		return "我是"+name+",今年"+age;
	}
	public String talk(String like){
		return "我的爱好是"+like;
	}
}

class Student extends Person{
	String school;
	public Student(String name, int age, String like, String school){
		this.name = name;
		this.age = age;
		this.like = like;
		this.school = school;
	}
	public String talk(){
		return super.talk()+",我在"+school;
	}
}
public class homework01_10 {
	public static void main(String[] args) {
		Person p1 = new Person("张三", 25, "足球");
		System.out.println(p1.talk());
		System.out.println(p1.talk("足球"));
		Person p2 = new Student("李四", 26, "篮球", "北京");
		System.out.println(p2.talk());
	}
	
}
