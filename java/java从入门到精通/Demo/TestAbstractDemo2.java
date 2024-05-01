abstract class Person{
	String name;
	int age;
	String occupation;
	public Person(String name, int age, String occupation){
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}

	public abstract String talk();
}
class Student extends Person{
	public Student(String name, int age, String occupation){
		super(name, age, occupation);
	}

	public String talk(){
		return "学生-->姓名: "+this.name+", 年龄: "+this.age+", 职业: "+this.occupation+"! ";
	}
}
public class TestAbstractDemo2 {
	public static void main(String[] args) {
		Student s = new Student("张三", 20, "学生");
		System.out.println(s.talk());
	}
	
}
