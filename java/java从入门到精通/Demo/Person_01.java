import java.io.*;
public class Person_01 implements Serializable{
	public static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public Person_01(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return "姓名: "+this.name+",年龄: "+this.age;
	}
	
}
