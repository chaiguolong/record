import java.util.*;
public class TestJavasort {
	public static void main(String[] args) {
		int a[] = {4, 32, 45, 32, 65, 32, 2};

		System.out.println("数组排序前的顺序: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "    ");
		}
		Arrays.sort(a);
		System.out.println("\n数组排序后的顺序: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"	");
		}
	}
}
