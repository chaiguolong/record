class Person{
	public Person(){
		System.out.println("1.public Person()");
	}
	//此代码会首先被执行
	static
	{
		System.out.println("2.Person类的静态代码块被调用! ");
	}
}
public class TestStaticDemo5 {
	static{
		System.out.println("3.TestStaticDemo5 类的静态代码块被调用! ");
	}
	//运行本程序时,静态代码块会被自动执行
	public static void main(String[] args) {
		System.out.println("4.程序开始执行! ");
		//产生两个实例化对象
		new Person();
		new Person();
	}

	
}
