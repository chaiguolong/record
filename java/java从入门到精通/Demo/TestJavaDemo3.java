class Person{
	public void fun1(){
		System.out.println("1.Person{fun1()}");
	}
	public void fun2(){
		System.out.println("2.Person{fun2()}");
	}
}
//Student类继承Person类,也就继承了Person类的fun1(),fun2()方法
class Student extends Person{
	//在这里覆写了Person类中的fun1()方法
	public void fun1(){
		System.out.println("3.Student{fun1()}");
	}
	public void fun3(){
		System.out.println("4.Student{fun3()}");
	}
}
public class TestJavaDemo3 {
	public static void main(String[] args) {
		//声明一个父类对象并通过子类对象对其济宁实例化
		Person p = new Student();
		//判断对象p是否是Student类的实例
		if(p instanceof Student){
			//将Person类的p转为Student类型
			Student s = (Student)p;
			s.fun1();
		}else{
			p.fun2();
		}
	}
	
}
