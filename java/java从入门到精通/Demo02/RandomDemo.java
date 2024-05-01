import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			int num= rd.nextInt(100);
			System.out.print(num+" ");
		}
		System.out.println();
	}
	
}
