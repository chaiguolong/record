package demo.java.c;
import demo.java.b.Student;
public class TestPackage4 {
	public static void main(String[] args) {
		Student s = new Student("javafans");
		s.name = "javafans";
		System.out.println(s.talk());
	}
}
