import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("A");
		v.add("B");
		v.add("c");
		v.add("D");
		v.add("E");
		v.add("F");
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement()+"\t");
		}
	}
	
}
