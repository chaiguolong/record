public class TestJavafangfa {
	public static void main(String[] args) {
		double num;
		num = show_length(22, 19);
		System.out.println("对角线长度 = "+num);
	}

	public static double show_length(int m, int n){
		return Math.sqrt(m*m+n*n);
	}
	
}
