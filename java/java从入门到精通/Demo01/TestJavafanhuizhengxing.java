public class TestJavafanhuizhengxing {
	public static void main(String[] args) {
		int num;
		num = star(7);
		System.out.println(num + " star printed");
	}
	//star()method
	public static int star(int n){
		for (int i = 1; i < 2*n; i++) {
			System.out.print("*");
		}
		System.out.println();
		return 2*n;
	}
	
}
