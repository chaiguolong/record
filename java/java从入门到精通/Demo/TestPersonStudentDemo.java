class Person{
	String name;
	int age;
}

class Student extends Person{
	String school;
}
public class TestPersonStudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		//访问Person类中的name属性
		s.name = "张三";
		//访问Person类中的age属性
		s.age = 25;
		//访问Student类中的school属性
		s.school = "北京";
		System.out.println("姓名: "+s.name+", 年龄: "+s.age+", 学校: "+s.school);
	}
	
}
