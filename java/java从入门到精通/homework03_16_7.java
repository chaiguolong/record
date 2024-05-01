import java.util.Iterator;
import java.util.TreeSet;

public class homework03_16_7 {
	public static void main(String[] args) {
		TreeSet<Integer> tm = new TreeSet<Integer>();
		tm.add(3);
		tm.add(6);
		tm.add(9);
		tm.add(7);
		tm.add(18);
		tm.add(25);
		Iterator<Integer> it = tm.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	
}
