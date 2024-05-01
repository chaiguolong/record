public class TestColor07 {
	public static void main(String[] args) {
		for (Color_03 c : Color_03.values()) {
			System.out.println(c.ordinal()+"--->" + c.name()+": "+c.getColor03());
		}
	}
	
}
