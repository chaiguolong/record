class Test{
	//throw在指定方法中不处理异常,在调用此方法的地方处理
	void add(int a, int b) throws Exception{
		int c;
		c = a/b;
		System.out.println(a+"/"+b+" = "+c);
	}
}
public class TestException_5 {
	public static void main(String[] args) {
		Test t = new Test();
		t.add(4, 0);
	}
	
}
