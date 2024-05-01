interface Person{
	public void fun1();
}
class Student implements Person{
	public void fun1(){
		System.out.println("Student fun1()");
	}
}
public class TestInterfaceObject {
	public static void main(String[] args) {
		Person p = new Student();
		p.fun1();
	}
	
}
