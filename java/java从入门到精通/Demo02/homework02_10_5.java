class Person{
	String name = "张三";
	int age = 25;
	public void talk(){
		System.out.println("hello world.");
	}
}
class Student extends Person{
	public void talk(){
		System.out.println("hello teacher");
	}

	public void talk(String name){
		System.out.println(name+"说: hello teacher");
	}
}
public class homework02_10_5 {
	public static void main(String[] args) {
		Student p = new Student();
		p.talk();
		p.talk(p.name);
	}
	
}
