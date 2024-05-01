import java.util.Iterator;
import java.util.TreeSet;

public class homework02_16_7 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(6);
		ts.add(9);
		ts.add(7);
		ts.add(18);
		ts.add(25);
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "	");
		}
		System.out.println();
	}
	
}
