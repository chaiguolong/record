import java.util.*;
public class homework_16 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(3);
		set.add(6);
		set.add(9);
		set.add(7);
		set.add(18);
		set.add(25);

		System.out.println("TreeSet输出的元素: ");
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+"	");
		}
		System.out.println();
	}
	
}
