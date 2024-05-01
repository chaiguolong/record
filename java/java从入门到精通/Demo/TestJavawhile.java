public class TestJavawhile {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1 + 2 + ... + 10 = "+sum);
	}
	
}
