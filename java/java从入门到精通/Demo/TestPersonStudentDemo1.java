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
		//实际上程序在这里隐含了这样一条语句
		super();
		System.out.println("2.public Student(){}");
	}
}
public class TestPersonStudentDemo1 {
	public static void main(String[] args) {
		Student s = new Student();
	}
	
}
