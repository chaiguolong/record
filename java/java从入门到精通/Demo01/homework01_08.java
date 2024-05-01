import java.util.*;
public class homework01_08 {
	public static void main(String[] args) {
		int a[] = {25, 24, 12, 76, 98, 101, 90, 28};
		System.out.println("数组排序前: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();

		Arrays.sort(a);
		System.out.println("数组排序后: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}
	
}
