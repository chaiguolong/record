class Person{
	private String name;
	private int age;
	private void talk(){
		System.out.println("我是: "+name+",今年: "+age+"岁");
	}
	public void say(){
		talk();
	}
	public void setName(String str){
		name = str;
	}
	public void setAge(int a){
		if(a>0){
			age = a;
		}
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class TestPersonDemo5 {
	public static void main(String[] args) {
		//声明并实例化一个Person对象p
		Person p = new Person();
		//给p中的属性赋值
		p.setName("张三");
		//在这里将p对象中的年龄属性赋值为30岁
		p.setAge(30);
		//调用Person类中的say()方法
		p.say();
	}
	
}
