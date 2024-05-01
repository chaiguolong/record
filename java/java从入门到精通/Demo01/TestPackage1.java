package demo.java;
class Person{
	public String talk(){
		return "Person-->talk()";
	}
}
public class TestPackage1 {
	public static void main(String[] args) {
		System.out.println(new Person().talk());
	}
	
}
