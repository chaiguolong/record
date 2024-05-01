public class TestJavabreak {
	public static void main(String[] args) {
		int i;

		for (i = 1; i <= 10; i++) {
			if(i%3 == 0){
				//跳出整个循环体
				break;
			}
			System.out.println("i = "+i);
		}
		System.out.println("循环中断: i = "+i);
	}
	
}
