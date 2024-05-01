class Person{
	String name = "张三";
	int age = 20;
	String sex = "女生";

	public String talk(){
		return "我是"+this.name+", 今年"+this.age+", 我是"+this.sex;
	}
}
public class homework01_12 {
	public static void main(String[] args) {
		System.out.println(new Person().talk());
		
	}
	
}
