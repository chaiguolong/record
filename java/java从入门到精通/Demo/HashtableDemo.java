import java.util.*;
public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("one", 1);
		ht.put("two", 2);
		ht.put("Three", 3);
		Integer num = ht.get("two");
		if(num != null){
			System.out.println("two = " + num);
		}
	}
	
}
