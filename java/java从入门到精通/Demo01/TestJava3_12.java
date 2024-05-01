public class TestJava3_12 {
	public static void main(String[] args) {
		int a = 55;
		int b = 9;
		float g,h;

		System.out.println("a = "+a+", b = "+b);
		g = a/b;
		System.out.println("a / b = "+g+"\n");
		System.out.println("a = "+a+", b = "+b);
		//在这里对数据类型进行强制转换
		h = (float)a/b;
		System.out.println("a/b = "+h);
	}
	
}
