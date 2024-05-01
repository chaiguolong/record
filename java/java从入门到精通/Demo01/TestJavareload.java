public class TestJavareload {
	public static void main(String[] args) {
		int int_sum;
		double double_sum;
		//调用有两个参数的add方法
		int_sum = add(3, 5);
		System.out.println("int_sum = add(3, 5)的值是: "+int_sum);
		//调用有3个参数的add方法
		int_sum = add(3, 5, 6);
		System.out.println("int_sum = add(3, 5, 6)的值是: "+int_sum);
		//输入的数值为double类型
		double_sum = add(3.2, 6.5);
		System.out.println("double_sum = add(3,2, 6.5)的值是: "+double_sum);
	}

	public static int add(int x, int y){
		return x+y;
	}

	public static int add(int x, int y, int z){
		return x+y+z;
	}

	public static double add(double x, double y){
		return x*y;
	}
	
}
