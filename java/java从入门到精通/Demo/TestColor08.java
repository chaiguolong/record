public class TestColor08 {
	public static void main(String[] args) {
		for (Color_04 c : Color_04.values()) {
			System.out.println(c.ordinal() + "--->"+c.name() + ": "+c.getColor());
		}
	}
	
}
