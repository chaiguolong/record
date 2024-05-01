class Person{
	String name;
	int age;
	public String talk(){
		return "我是: "+this.name+",今年: "+this.age+"岁";
	}
}

class Student extends Person{
	String school;
	public Student(String name, int age, String school){
		//分别为属性赋值
		this.name = name;
		this.age = age;
		this.school = school;
	}

	//此处覆写Person中的talk()方法
	public String talk(){
		return "我在"+this.school+"上学";
	}
}
public class TestOverDemo1 {
	public static void main(String[] args) {
		Student s = new Student("张三", 25, "北京");
		//此时调用的是子类中的talk()方法
		System.out.println(s.talk());
	}
	
}
