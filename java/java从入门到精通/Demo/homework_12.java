class Person{
	String name;
	int age;
	String sex;

	public Person(String name, int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String talk(){
		return "我是"+this.name+",今年"+this.age+"岁,我是一个"+this.sex;
	}
}
public class homework_12 {
	public static void main(String[] args) {
		System.out.println(new Person("张三", 20, "男生").talk());
		
	}
	
}
