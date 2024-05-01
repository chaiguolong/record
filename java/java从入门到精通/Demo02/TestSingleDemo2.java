class Person{
	String name;
	//在本类声明一Person对象p,注意此对象用final标记,表示不能再重新实例化
	private static final Person p = new Person();
	private Person(){
		name = "张三";
	}
	public static Person getP(){
		return p;
	}
}
public class TestSingleDemo2 {
	public static void main(String[] args) {
		//声明一个Person类的对象
		Person p = null;
		p = Person.getP();
		System.out.println(p.name);
	}
	
}
