import java.util.*;
public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> ve = new Vector<String>();
		ve.add("A");
		ve.add("B");
		ve.add("C");
		ve.add("D");
		ve.add("E");
		ve.add("F");
		Enumeration<String> e = ve.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement()+"\t");
		}
	}
	
}
