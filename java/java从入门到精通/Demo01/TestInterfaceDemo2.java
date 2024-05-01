interface A{
	int i = 10;
	public void sayI();
}
interface E{
	int x = 40;
	public void sayE();
}
//B同时继承A,E两个接口
interface B extends A,E{
	int j = 20;
	public void sayJ();
}
//c继承实现B接口,也就意味着要实现A,B,E等3个接口的抽象方法
class C implements B{
	public void sayI(){
		System.out.println("i = "+i);
	}
	public void sayJ(){
		System.out.println("j = "+j);
	}
	public void sayE(){
		System.out.println("e = "+x);
	}
}
public class TestInterfaceDemo2 {
	public static void main(String[] args) {
		C c = new C();
		c.sayI();
		c.sayJ();
	}
	
}
