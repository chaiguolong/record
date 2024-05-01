interface A{
	public void fun1();
}
class B{
	int i = 10;
	public void get(A a){
		a.fun1();
	}
	public void test(){
		this.get(new A(){
			public void fun1(){
				System.out.println(i);
			}
		});
	}
}
public class TestNonameInner2 {
	public static void main(String[] args) {
		B b = new B();
		b.test();
	}
}
