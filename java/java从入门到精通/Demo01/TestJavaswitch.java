public class TestJavaswitch {
	public static void main(String[] args) {
		int a = 100, b = 7;
		char oper = '/';

		switch (oper) {
			case '+': 
				System.out.println(a+"+"+b+" = "+(a+b));
				break;
			case '-': 
				System.out.println(a+"-"+b+" = "+(a-b));
				break;
			case '*':
				System.out.println(a+"*"+b+" = "+(a*b));
				break;
			case '/':
				System.out.println(a+"/"+b+" = "+((float)a/b));
				break;
			default:
				System.out.println("未知的操作!");
		}
	}
	
}
