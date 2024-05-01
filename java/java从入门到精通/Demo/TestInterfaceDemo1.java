interface Person{
	String name = "张三";
	int age = 25;
	String occupation = "学生";

	//声明一个抽象方法talk()
	public abstract String talk();

}
//Student类实现自Person类
class Student implements  Person{

	//覆写talk()方法
	public String talk(){
		return "学生-->姓名: "+Person.name+", 年龄: "+Person.age+", 职业: "+Person.occupation+"! ";
	}
}

class TestInterfaceDemo1 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.talk());
	}
	
}
