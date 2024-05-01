package demo.java.b;
import demo.java.a.Person02;
public class Student extends Person02{

	public Student(String name){
		this.name = name;
	}

	public String talk(){
		return "Person--> talk() , " + this.name;
	}
}
