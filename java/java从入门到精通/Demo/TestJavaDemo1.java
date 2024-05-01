class Person{
	public void fun1(){
		System.out.println("1.Person{fun1()}");
	}

	public void fun2(){
		System.out.println("2.Person{fun2()}");
	}
}

//Student类扩展自Person类,也就继承了Person类中的fun1(),fun2()方法
class Student extends Person{
	//在这里覆写了Person类中的fun1()方法
	public void fun1(){
		System.out.println("3.Student{fun1()}");
	}
	public void fun3(){
		System.out.println("4.Student{fun3()}");
	}
}


public class TestJavaDemo1 {
	public static void main(String[] args) {
		//此处,父类对象由子类实例化[]
		Person p = new Student();
		//调用fun1()方法,观察此处调用的是哪个类里的fun1()方法
		p.fun1();
		p.fun2();
	}
	
}
