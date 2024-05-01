public class TestJavafanhuizhengxing {
	public static void main(String[] args) {
		int num;
		num = star(7);
		System.out.println(num+"stars printed");
	}

	//star() method
	public static int star(int n){
		//输出2*n个星号
		for (int i = 0; i < 2*n; i++) {
			System.out.print("*");
		}
		//换行
		System.out.println();
		//返回整数2*n
		return 2*n;
	}
	
}
