public class TestJavafangfa {
	public static void main(String[] args) {
		System.out.println("对角线的长度为: "+cal(3,4));
	}

	public static double cal(int a, int b){
		double len = Math.sqrt(a*a+(b*b));
		return len;
	}
	
}
