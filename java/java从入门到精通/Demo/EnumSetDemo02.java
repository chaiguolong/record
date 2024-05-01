import java.util.*;
public class EnumSetDemo02 {
	public static void main(String[] args) {
		EnumSet<Color_01> eSet = EnumSet.noneOf(Color_01.class);
		Iterator<Color_01> it = eSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
