class Person{
	String name;
	int age;
	//父类的构造方法
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Student extends Person{
	String school;
	//子类的构造方法
	public Student(){
		//在这里用super调用父类中的构造方法
		super("张三",25);
	}
}
public class TestPersonStudentDemo2 {
	public static void main(String[] args) {
		Student s = new Student();
		//为Student类中的school赋值
		s.school = "北京";
		System.out.println("姓名: "+s.name+", 年龄: "+s.age+", 学校: "+s.school);
	}
	
}
