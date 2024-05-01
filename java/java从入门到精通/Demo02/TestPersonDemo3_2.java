class Person{
	private String name;
	private int age;
	void talk(){
		System.out.println("我是: "+name+",今年: "+age+"岁");
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		if(age > 0){
			this.age = age;
		}
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class TestPersonDemo3_2 {
	public static void main(String[] args) {
		//声明并实例化一个Person对象p
		Person p = new Person();
		//给p中的属性赋值
		p.setName("张三");
		//在这里将p对象中的年龄赋值为-25
		p.setAge(-25);
		//调用Person类中的talk()方法
		p.talk();
	}
	
}
