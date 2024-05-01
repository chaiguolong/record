class Person{
	String name;
	int age;
	//父类的构造方法
	public Person(){
		System.out.println("1.public Person(){}");
	}
}
class Student extends Person{
	String school;
	//子类的构造方法
	public Student(){
		System.out.println("2.public Student(){}");
	}
}
public class TestPersonStudentDemo1 {
	public static void main(String[] args) {
		Student s = new Student();
	}
	
}
