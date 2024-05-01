import java.io.Serializable;

public class Person04 implements Serializable{
	public static final long serialVersionUID = 1l;
	private String name;
	private int age;
	public Person04(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return "姓名: "+this.name+",年龄: "+this.age;
	}
	
}
