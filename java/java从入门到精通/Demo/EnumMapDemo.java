import java.util.*;
public class EnumMapDemo {
	public static void main(String[] args) {
		EnumMap<Color_01, String> eMap = new EnumMap<Color_01,String>(Color_01.class);
		eMap.put(Color_01.RED,"红色");
		eMap.put(Color_01.GREEN, "绿色");
		eMap.put(Color_01.BLUE,"蓝色");
		for (Map.Entry<Color_01,String> entry : eMap.entrySet()) {
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
	}
	
}
