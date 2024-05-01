abstract class Person{
	String name;
	int age;
	String occupation;

	//声明一个抽象方法talk()
	public abstract String talk();
}
//Student类继承自Person类
class Student extends Person{
	public Student(String name, int age, String occupation){
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}

	//覆写talk()方法
	public String talk(){
		return "学生-->姓名: "+this.name+", 年龄: "+this.age+", 职业: "+this.occupation+"! ";
	}
}
//Worker类继承自Person类
class Workder extends Person{
	public Workder(String name, int age, String occupation){
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}

	//覆写talk()方法
	public String talk(){
		return "工人-->姓名: "+this.name+", 年龄: "+this.age+", 职业: "+this.occupation;
	}
}
public class TestAbstractDemo1 {
	public static void main(String[] args) {
		Student s = new Student("张三", 20, "学生");
		Workder w = new Workder("李四", 30, "工人");
		System.out.println(s.talk());
		System.out.println(w.talk());
	}
	
}
