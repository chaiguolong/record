class Person{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	//覆写父类(Object)中的equals方法
	public boolean equals(Object o){
		boolean temp = true;
		//声明一个p1对象,此对象实际上就是当前调用equals方法的对象
		Person p1 = this;
		//判断Object类对象是否是Person实例
		if(o instanceof Person){
			//如果是Person类的实例,则进行向下转型
			Person p2 = (Person)o;
			//调用String类中的equals方法
			if(!(p1.name.equals(p2.name) && (p1.age == p2.age))){
				temp = false;
			}
		}else{
			//如果不是Person实例,则直接返回false
			temp = false;
		}

		return temp;
	}
}
public class TestOverEquals2 {
	public static void main(String[] args) {
		Person t_p1 = new Person("张三", 25);
		Person t_p2 = new Person("张三", 25);
		//判断p1和p2的内容是否相等
		System.out.println(t_p1.equals(t_p2) ? "是同一个人!" : "不是同一个人");
	}
	
}
