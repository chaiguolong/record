class Person{
	String name;
	int age;
	String sex;
	public Person(String name, int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void talk(){
		System.out.println("我是:"+this.name+",今年:"+this.age+",性别是:"+this.sex);
	}
}
public class homework02_12_13 {
	public static void main(String[] args) {
		new Person("张三", 25, "男性").talk();
	}
	
}
