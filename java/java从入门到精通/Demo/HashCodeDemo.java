import java.util.*;
class Person{
	private String name;
	private int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "姓名: "+this.name+", 年龄: "+this.age;
	}
	//注意这里只是说明问题,只是返回了一个true
	public boolean equals(Object obj){
		return true;
	}

	public int hashCode(){
		return 20;
	}
}
public class HashCodeDemo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(new Person("张三", 20), "张三");
		System.out.println(hm.get(new Person("张三", 20)));
	}
	
}
