class Person extends Object{
	String name = "张三";
	int age = 25;
	//覆写Object类中的toString()方法
	public String toString(){
		return "我是: "+this.name+", 今年: "+this.age+"岁";
	}
}
public class TestToStringDemo2 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
	}
	
}
